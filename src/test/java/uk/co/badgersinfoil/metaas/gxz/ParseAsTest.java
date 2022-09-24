package uk.co.badgersinfoil.metaas.gxz;

import junit.framework.TestCase;
import uk.co.badgersinfoil.metaas.ActionScriptFactory;
import uk.co.badgersinfoil.metaas.ActionScriptParser;
import uk.co.badgersinfoil.metaas.dom.ASCompilationUnit;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class ParseAsTest extends TestCase {

    public void testName() {
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\Admin\\Adobe Flash Builder 4.7\\TestAir\\src\\com\\test\\TestAs.as");
            InputStreamReader reader = new InputStreamReader(in);
            ActionScriptFactory fact = new ActionScriptFactory();
            ActionScriptParser parser = fact.newParser();
            ASCompilationUnit unit = parser.parse(reader);
            System.out.println(unit.toString());
            System.out.println("hello");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}


