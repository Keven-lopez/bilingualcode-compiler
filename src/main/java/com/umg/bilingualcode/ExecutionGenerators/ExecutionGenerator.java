package com.umg.bilingualcode.ExecutionGenerators;

import com.umg.bilingualcode.*;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.HashMap;
import java.util.Map;

public class ExecutionGenerator extends SpanglishCodeBaseVisitor<Object> {

    private final Map<String, Object> variables = new HashMap<>();
    private final Map<String, SpanglishCodeParser.FunctionDeclContext> functions = new HashMap<>();

    public void execute(ParseTree tree) {
        visit(tree);
    }

    // =========================
    // Declarations
    // =========================
    @Override
    public Object visitDeclaration(SpanglishCodeParser.DeclarationContext ctx) {
        variables.put(ctx.IDENTIFIER().getText(), null);
        return null;
    }

    @Override
    public Object visitConstantDecl(SpanglishCodeParser.ConstantDeclContext ctx) {
        variables.put(ctx.IDENTIFIER().getText(), visit(ctx.expression()));
        return null;
    }

    @Override
    public Object visitAssignment(SpanglishCodeParser.AssignmentContext ctx) {
        variables.put(ctx.IDENTIFIER().getText(), visit(ctx.expression()));
        return null;
    }

    // =========================
    // Display
    // =========================
    @Override
    public Object visitDisplayStmt(SpanglishCodeParser.DisplayStmtContext ctx) {
        System.out.println(visit(ctx.expression()));
        return null;
    }

    // =========================
    // IF
    // =========================
    @Override
    public Object visitIfStmt(SpanglishCodeParser.IfStmtContext ctx) {
        Object cond = visit(ctx.expression());

        if (Boolean.TRUE.equals(cond)) {
            int limit = ctx.ELSE() == null ? ctx.statement().size() : ctx.statement().size() / 2;
            for (int i = 0; i < limit; i++) {
                visit(ctx.statement(i));
            }
        } else if (ctx.ELSE() != null) {
            int half = ctx.statement().size() / 2;
            for (int i = half; i < ctx.statement().size(); i++) {
                visit(ctx.statement(i));
            }
        }

        return null;
    }

    // =========================
    // WHILE
    // =========================
    @Override
    public Object visitWhileStmt(SpanglishCodeParser.WhileStmtContext ctx) {
        while (Boolean.TRUE.equals(visit(ctx.expression()))) {
            for (SpanglishCodeParser.StatementContext stmt : ctx.statement()) {
                visit(stmt);
            }
        }
        return null;
    }

    // =========================
    // Functions
    // =========================
    @Override
    public Object visitFunctionDecl(SpanglishCodeParser.FunctionDeclContext ctx) {
        functions.put(ctx.IDENTIFIER().getText(), ctx);
        return null;
    }

    @Override
    public Object visitFunctionCall(SpanglishCodeParser.FunctionCallContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        SpanglishCodeParser.FunctionDeclContext function = functions.get(functionName);

        if (function == null) {
            System.out.println("Runtime Error: function '" + functionName + "' not defined.");
            return null;
        }

        // Save previous variable values (for local scope)
        Map<String, Object> oldVariables = new HashMap<>(variables);

        // Assign parameters
        if (function.paramList() != null && ctx.argList() != null) {
            int paramCount = function.paramList().IDENTIFIER().size();
            int argCount = ctx.argList().expression().size();

            for (int i = 0; i < Math.min(paramCount, argCount); i++) {
                String paramName = function.paramList().IDENTIFIER(i).getText();
                Object argValue = visit(ctx.argList().expression(i));
                variables.put(paramName, argValue);
            }
        }

        // Execute body
        Object returnValue = null;

        for (SpanglishCodeParser.StatementContext stmt : function.statement()) {
            visit(stmt);
        }

        if (function.returnStmt() != null) {
            returnValue = visit(function.returnStmt());
        }

        // Restore variables
        variables.clear();
        variables.putAll(oldVariables);

        return returnValue;
    }

    @Override
    public Object visitReturnStmt(SpanglishCodeParser.ReturnStmtContext ctx) {
        return visit(ctx.expression());
    }

    // =========================
    // Expressions
    // =========================
    @Override
    public Object visitExpression(SpanglishCodeParser.ExpressionContext ctx) {

        if (ctx.literal() != null) {
            return visit(ctx.literal());
        }

        if (ctx.IDENTIFIER() != null && ctx.getChildCount() == 1) {
            return variables.get(ctx.IDENTIFIER().getText());
        }

        if (ctx.LPAREN() != null) {
            return visit(ctx.expression(0));
        }

        if (ctx.expression().size() == 2) {
            Object left = visit(ctx.expression(0));
            Object right = visit(ctx.expression(1));
            String op = ctx.operator().getText();

            // Numeric operations
            if (left instanceof Number && right instanceof Number) {
                double a = ((Number) left).doubleValue();
                double b = ((Number) right).doubleValue();

                switch (op) {
                    case "+": return a + b;
                    case "-": return a - b;
                    case "*": return a * b;
                    case "/": return a / b;
                    case "==": return a == b;
                    case "!=": return a != b;
                    case "<": return a < b;
                    case ">": return a > b;
                    case "<=": return a <= b;
                    case ">=": return a >= b;
                }
            }

            // Boolean operations
            if (left instanceof Boolean && right instanceof Boolean) {
                boolean a = (Boolean) left;
                boolean b = (Boolean) right;

                switch (op) {
                    case "and":
                    case "y": return a && b;
                    case "or":
                    case "o": return a || b;
                }
            }
        }

        return null;
    }

    // =========================
    // Literals
    // =========================
    @Override
    public Object visitLiteral(SpanglishCodeParser.LiteralContext ctx) {

        if (ctx.NUMBER_LITERAL() != null) {
            String text = ctx.NUMBER_LITERAL().getText();
            return text.contains(".") ? Double.parseDouble(text) : Integer.parseInt(text);
        }

        if (ctx.STRING_LITERAL() != null) {
            String text = ctx.STRING_LITERAL().getText();
            return text.substring(1, text.length() - 1);
        }

        if (ctx.TRUE() != null) return true;
        if (ctx.FALSE() != null) return false;

        return null;
    }
}