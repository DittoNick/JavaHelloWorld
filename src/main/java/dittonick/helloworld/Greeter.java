package dittonick.helloworld;

import java.util.Arrays;

/**
* @author dittonick <uncommonaddress@gmail.com>
*/
public final class Greeter {

    /**
     * Greets world.
     */
    public void greet() {
        System.out.printf("Hello world\n");
    }

    /**
     * Greets.
     *
     * @param whom Whom to greet.
     */
    public void greet(String whom) {
        System.out.printf("Hello %s\n", whom);
    }
}
