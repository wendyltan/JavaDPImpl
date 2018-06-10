package DecoratorPattern;

/**
 * A concrete decorator,override the implemented method and add extra decoration!
 */
public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void cook() {
        beverage.cook();
        System.out.println("Adding milk!");
    }
}
