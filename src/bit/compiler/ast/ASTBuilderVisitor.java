package bit.compiler.ast;

import bit.compiler.ast.nodes.*;
import bit.compiler.ast.nodes.expression.ExpressionNode;
import bit.compiler.ast.nodes.expression.ExpressionNodeBinop;
import bit.compiler.ast.nodes.expression.ExpressionNodeNum;
import bit.compiler.parser.bitBaseVisitor;
import bit.compiler.parser.bitParser;
import bit.compiler.parser.bitLexer;

public class ASTBuilderVisitor extends bitBaseVisitor {

    @Override public AST visitStartRule(bitParser.StartRuleContext ctx)
    {
        AST ast = new AST();
        ast.setRoot(visitProgram(ctx.program()));
        return ast;
    }

    @Override public ProgramNode visitProgram(bitParser.ProgramContext ctx)
    {
        ProgramNode prog = new ProgramNode();

        for(bitParser.StatementContext stmtCtx: ctx.statement())
        {
            prog.addStmt(visitStatement(stmtCtx));
        }

        return prog;
    }

    @Override public StatementNode visitStatement(bitParser.StatementContext ctx)
    {
        StatementNode stmt =  new StatementNode();

        if(ctx.id_or_reg().ID() != null){}
        else if(ctx.id_or_reg().reg() != null)
        {
            stmt.setReg(visitReg(ctx.id_or_reg().reg()));
        }

        stmt.setExpr(visitExpression(ctx.expression()));

        return stmt;
    }

    @Override public RegisterNode visitReg(bitParser.RegContext ctx)
    {
        return new RegisterNode(ctx.getText());
    }

    @Override public ExpressionNode visitExpression(bitParser.ExpressionContext ctx)
    {
        if(ctx.binop() != null)
        {
            return new ExpressionNodeBinop(ctx.binop(), visitExpression(ctx.expression(0)), visitExpression(ctx.expression(1)));
        }
        else if(ctx.NUM() != null)
        {
            return new ExpressionNodeNum(ctx.NUM().getText());
        }
        else if(ctx.start.getType() == bitLexer.PARENTHESIS_OPEN)
        {
            return visitExpression(ctx.expression(0));
        }

        return new ExpressionNode();
    }

}
