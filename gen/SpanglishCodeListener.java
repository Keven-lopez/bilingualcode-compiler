// Generated from C:/Users/ded5t/IdeaProjects/bilingualcode-compiler/src/main/antlr4/SpanglishCode.g4 by ANTLR 4.13.2

package com.umg.bilingualcode;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SpanglishCodeParser}.
 */
public interface SpanglishCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(SpanglishCodeParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(SpanglishCodeParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(SpanglishCodeParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(SpanglishCodeParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(SpanglishCodeParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(SpanglishCodeParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(SpanglishCodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(SpanglishCodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SpanglishCodeParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SpanglishCodeParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void enterInputStmt(SpanglishCodeParser.InputStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#inputStmt}.
	 * @param ctx the parse tree
	 */
	void exitInputStmt(SpanglishCodeParser.InputStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#displayStmt}.
	 * @param ctx the parse tree
	 */
	void enterDisplayStmt(SpanglishCodeParser.DisplayStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#displayStmt}.
	 * @param ctx the parse tree
	 */
	void exitDisplayStmt(SpanglishCodeParser.DisplayStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void enterIfStmt(SpanglishCodeParser.IfStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#ifStmt}.
	 * @param ctx the parse tree
	 */
	void exitIfStmt(SpanglishCodeParser.IfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void enterWhileStmt(SpanglishCodeParser.WhileStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#whileStmt}.
	 * @param ctx the parse tree
	 */
	void exitWhileStmt(SpanglishCodeParser.WhileStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDecl(SpanglishCodeParser.FunctionDeclContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#functionDecl}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDecl(SpanglishCodeParser.FunctionDeclContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void enterParamList(SpanglishCodeParser.ParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#paramList}.
	 * @param ctx the parse tree
	 */
	void exitParamList(SpanglishCodeParser.ParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SpanglishCodeParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SpanglishCodeParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#argList}.
	 * @param ctx the parse tree
	 */
	void enterArgList(SpanglishCodeParser.ArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#argList}.
	 * @param ctx the parse tree
	 */
	void exitArgList(SpanglishCodeParser.ArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void enterReturnStmt(SpanglishCodeParser.ReturnStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#returnStmt}.
	 * @param ctx the parse tree
	 */
	void exitReturnStmt(SpanglishCodeParser.ReturnStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void enterCondition(SpanglishCodeParser.ConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#condition}.
	 * @param ctx the parse tree
	 */
	void exitCondition(SpanglishCodeParser.ConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#comparator}.
	 * @param ctx the parse tree
	 */
	void enterComparator(SpanglishCodeParser.ComparatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#comparator}.
	 * @param ctx the parse tree
	 */
	void exitComparator(SpanglishCodeParser.ComparatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SpanglishCodeParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SpanglishCodeParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SpanglishCodeParser#operator}.
	 * @param ctx the parse tree
	 */
	void enterOperator(SpanglishCodeParser.OperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SpanglishCodeParser#operator}.
	 * @param ctx the parse tree
	 */
	void exitOperator(SpanglishCodeParser.OperatorContext ctx);
}