// Generated from decaf.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link decafParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface decafVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link decafParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(decafParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(decafParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#varDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarDeclaration(decafParser.VarDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#structDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructDeclaration(decafParser.StructDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#varType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarType(decafParser.VarTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#methodDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodDeclaration(decafParser.MethodDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#methodType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodType(decafParser.MethodTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameter(decafParser.ParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#parameterType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterType(decafParser.ParameterTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock(decafParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(decafParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#location}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocation(decafParser.LocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#methodCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMethodCall(decafParser.MethodCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(decafParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionNeg}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionNeg(decafParser.ExpressionNegContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionExc}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionExc(decafParser.ExpressionExcContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionMethod}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionMethod(decafParser.ExpressionMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLocation}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLocation(decafParser.ExpressionLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionLit}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionLit(decafParser.ExpressionLitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionParentesis}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionParentesis(decafParser.ExpressionParentesisContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExpressionPro}
	 * labeled alternative in {@link decafParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionPro(decafParser.ExpressionProContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArg(decafParser.ArgContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(decafParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#arith_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArith_op(decafParser.Arith_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#rel_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRel_op(decafParser.Rel_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#eq_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEq_op(decafParser.Eq_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#cond_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCond_op(decafParser.Cond_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#int_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInt_literal(decafParser.Int_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#char_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChar_literal(decafParser.Char_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link decafParser#bool_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_literal(decafParser.Bool_literalContext ctx);
}