package bit.compiler;

import bit.compiler.ast.AST;
import bit.compiler.ast.ASTBuilder;
import bit.compiler.generator.RealModeGen;
import bit.compiler.parser.bitLexer;
import bit.compiler.parser.bitParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.IOException;

import static org.antlr.v4.runtime.CharStreams.fromFileName;

public class Compiler {

    public Compiler()
    {

    }

    public void compile(String in, String out)
    {
        try
        {
            CharStream cs = fromFileName(in);
            bitLexer lexer = new bitLexer(cs);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            bitParser parser = new bitParser(tokens);

            AST ast = new ASTBuilder().build(parser.startRule());

            RealModeGen gen = new RealModeGen();
            gen.emitCode(ast, out);

            System.out.println("Compilation done");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
