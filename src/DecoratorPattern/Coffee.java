package DecoratorPattern;

/**
 * The real thing client want.It must implements the same
 * interface with decorator class.
 */
public class Coffee implements Beverage {
    @Override
    public void cook() {
        System.out.println("Coffee preparing..");
    }
}
