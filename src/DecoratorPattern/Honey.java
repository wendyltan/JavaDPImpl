package DecoratorPattern;

public class Honey extends BeverageDecorator {
    public Honey(Beverage beverage) {
        super(beverage);
    }

    @Override
    public void cook() {
        beverage.cook();
        System.out.println("Adding honey！");
    }
}
