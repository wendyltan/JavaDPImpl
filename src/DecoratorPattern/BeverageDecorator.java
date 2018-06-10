package DecoratorPattern;

/**
 * Let one class implements the interface,
 * It also has a protected member of its' interface
 * Pass in the interface instance via constructor
 * Call beverage's cook first in decorator's cook method.
 *
 */
public class BeverageDecorator implements Beverage {
    protected Beverage beverage;

    public BeverageDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public void cook() {
        beverage.cook();
    }


}
