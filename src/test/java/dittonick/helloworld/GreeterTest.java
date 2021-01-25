package dittonick.helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * @author dittonick <uncommonaddress@gmail.com>
 */
public class GreeterTest {

    private final PrintStream stdout = System.out;
    private ByteArrayOutputStream testStream;
    private PrintStream printStream;
    private String greetMethodEOL = "\n";
    private String predefinedGreetMethodText = "Hello ";
    private String textSuffixGreetMethodNoParamPassed = "world";

    @Before
    public void setUp() throws Exception {
        testStream = new ByteArrayOutputStream();
        printStream = new PrintStream(testStream);
        System.setOut(printStream);
    }

    @After
    public void tearDown() throws Exception {
        System.setOut(stdout);
    }

    @Test
    public void testGreetWithoutAnyParam() {
        Greeter instance = new Greeter();
        instance.greet();
        String result = testStream.toString();

        assertEquals(
            "Greet generates expected output",
            predefinedGreetMethodText.length()
            + textSuffixGreetMethodNoParamPassed.length()
            + greetMethodEOL.length(),
            result.length()
        );
    }

    @Test
    public void testGreetWithEmptyParamValue() {
        Greeter instance = new Greeter();
        String who = "";
        instance.greet(who);
        String result = testStream.toString();
        assertEquals(
            "Greet generates expected output",
            predefinedGreetMethodText.length()
            + who.length()
            + greetMethodEOL.length(),
            result.length()
        );
    }

    @Test
    public void testGreetWithNonEmptyParamValue() {
        Greeter instance = new Greeter();
        String who = "Mariana";
        instance.greet("Mariana");
        String result = testStream.toString();
        assertEquals(
            "Greet generates expected output",
            predefinedGreetMethodText.length()
            + who.length()
            + greetMethodEOL.length(),
            result.length()
        );
    }
}
