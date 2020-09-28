package bit.compiler.generator;

import bit.compiler.ast.AST;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class RealModeGen {

    private FileOutputStream out;

    public void emitCode(AST ast, String out)
    {
        File f = new File(out);
        try
        {
            this.out = new FileOutputStream(f);
            emit(ast);
            this.out.flush();
            this.out.close();
            System.out.println("Code generated");
        }
        catch(IOException e)
        {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
    }

    private void emit(AST ast) throws IOException {
        this.out.write(0xb8);
        this.out.write(0xc0);
        this.out.write(0x07);
        this.out.write(0xb8);
        this.out.write(0xd8);

        this.out.write(0xf4);

        for(int i = 0; i < 510 - 6; ++i)
        {
            this.out.write(0x0);
        }

        this.out.write(0x55);
        this.out.write(0xaa);
    }
}
