package dittonick.helloworld;

/**
 * @author dittonick
 */
public class Main {

    public static void main(String args[]) {
        Greeter greeter = new Greeter();
        greeter.greet("World");
        greeter.greet("Mariana");
        greeter.greet();
    }
}
