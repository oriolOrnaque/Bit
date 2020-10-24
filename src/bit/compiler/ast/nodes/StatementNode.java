package bit.compiler.ast.nodes;

import bit.compiler.ast.nodes.expression.ExpressionNode;

public class StatementNode {

    private boolean recipient_is_reg = false;
    private RegisterNode reg;
    private ExpressionNode expr;

    public void setReg(RegisterNode reg)
    {
        this.reg = reg;
        this.recipient_is_reg = true;
    }

    public void setExpr(ExpressionNode expr)
    {
        this.expr = expr;
    }
}
