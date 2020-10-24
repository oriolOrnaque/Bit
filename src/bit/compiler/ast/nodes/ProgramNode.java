package bit.compiler.ast.nodes;

import java.util.LinkedList;
import java.util.List;

public class ProgramNode {

    private List<StatementNode> stmts;

    public ProgramNode()
    {
        this.stmts = new LinkedList<>();
    }

    public void addStmt(StatementNode stmt)
    {
        this.stmts.add(stmt);
    }

}
