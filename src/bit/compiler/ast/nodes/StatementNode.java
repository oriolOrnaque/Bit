package bit.compiler.ast.nodes;

import bit.compiler.ast.nodes.expression.ExpressionNode;

public class StatementNode {

    private RegisterNode reg;
    private ExpressionNode expr;

    public void setReg(RegisterNode reg)
    {
        this.reg = reg;
    }

    public void setExpr(ExpressionNode expr)
    {
        this.expr = expr;
    }


}
