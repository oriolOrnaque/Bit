package bit.compiler;

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

            System.out.println("Compilation done");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

}
