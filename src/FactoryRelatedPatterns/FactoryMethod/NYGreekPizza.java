package FactoryRelatedPatterns.FactoryMethod;

public class NYGreekPizza extends Pizza {
    @Override
    protected void prepare() {
        super.prepare();
        System.out.println("NYGreekPizza preparing!");
    }

    @Override
    protected void cut() {
        super.cut();
        System.out.println("NYGreekPizza cutting!");
    }

    @Override
    protected void bake() {
        super.bake();
        System.out.println("NYGreekPizza baking!");
    }

    @Override
    protected void box() {
        super.box();
        System.out.println("NYGreekPizza boxing!");
    }
}
