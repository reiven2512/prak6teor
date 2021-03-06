// Generated from E:/projects/prak56teor/src/main/java\Expr.g4 by ANTLR 4.8
package com.antlr;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ExprParser}.
 */
public interface ExprListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ExprParser#r}.
	 * @param ctx the parse tree
	 */
	void enterR(ExprParser.RContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#r}.
	 * @param ctx the parse tree
	 */
	void exitR(ExprParser.RContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(ExprParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(ExprParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#add}.
	 * @param ctx the parse tree
	 */
	void enterAdd(ExprParser.AddContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#add}.
	 * @param ctx the parse tree
	 */
	void exitAdd(ExprParser.AddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void enterMul(ExprParser.MulContext ctx);
	/**
	 * Exit a parse tree produced by {@link ExprParser#mul}.
	 * @param ctx the parse tree
	 */
	void exitMul(ExprParser.MulContext ctx);
}