package FactoryRelatedPatterns.FactoryMethod;

public class NYCheesePizza extends Pizza {
    @Override
    protected void prepare() {
        super.prepare();
        System.out.println("NYCheesePizza preparing!");
    }

    @Override
    protected void cut() {
        super.cut();
        System.out.println("NYCheesePizza cutting!");
    }

    @Override
    protected void bake() {
        super.bake();
        System.out.println("NYCheesePizza baking!");
    }

    @Override
    protected void box() {
        super.box();
        System.out.println("NYCheesePizza boxing!");
    }
}
