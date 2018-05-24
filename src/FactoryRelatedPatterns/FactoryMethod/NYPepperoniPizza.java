package FactoryRelatedPatterns.FactoryMethod;

public class NYPepperoniPizza extends Pizza {
    @Override
    protected void prepare() {
        super.prepare();
        System.out.println("NYPepperoniPizza preparing!");
    }

    @Override
    protected void cut() {
        super.cut();
        System.out.println("NYPepperoniPizza cutting!");
    }

    @Override
    protected void bake() {
        super.bake();
        System.out.println("NYPepperoniPizza baking!");
    }

    @Override
    protected void box() {
        super.box();
        System.out.println("NYPepperoniPizza boxing!");
    }
}
