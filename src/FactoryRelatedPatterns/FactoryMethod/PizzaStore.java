package FactoryRelatedPatterns.FactoryMethod;

/**
 * So basically factory method means you can use factory pattern in your subclass instead of
 * parent class as a method instead of the whole class.You can see very clear from this example.
 */
public abstract class PizzaStore {

    protected abstract Pizza createPizza(String type);

    public Pizza orderPizza(String type){

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }


}
