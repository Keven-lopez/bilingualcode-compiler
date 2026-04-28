// Generated from C:/Users/ded5t/IdeaProjects/bilingualcode-compiler/src/main/antlr4/SpanglishCode.g4 by ANTLR 4.13.2

package com.umg.bilingualcode;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SpanglishCodeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SpanglishCodeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(SpanglishCodeParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(SpanglishCodeParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(SpanglishCodeParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SpanglishCodeParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SpanglishCodeParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#inputStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputStmt(SpanglishCodeParser.InputStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#displayStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisplayStmt(SpanglishCodeParser.DisplayStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#ifStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStmt(SpanglishCodeParser.IfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#whileStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStmt(SpanglishCodeParser.WhileStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#functionDecl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDecl(SpanglishCodeParser.FunctionDeclContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#paramList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamList(SpanglishCodeParser.ParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SpanglishCodeParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#argList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgList(SpanglishCodeParser.ArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#returnStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStmt(SpanglishCodeParser.ReturnStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition(SpanglishCodeParser.ConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#comparator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparator(SpanglishCodeParser.ComparatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SpanglishCodeParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SpanglishCodeParser#operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator(SpanglishCodeParser.OperatorContext ctx);
}