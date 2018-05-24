package FactoryRelatedPatterns.FactoryMethod;

/**
 * Putting concrete pizza create factory here.So each pizza store's operation
 * of pizza is related to the concrete pizza type returned.
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (type.equalsIgnoreCase("CHEESE")){
            return new NYCheesePizza();
        }else if (type.equalsIgnoreCase("GREEK")){
            return new NYGreekPizza();
        }else if(type.equalsIgnoreCase("PEPPERONI")){
            return new NYPepperoniPizza();
        }
        return null;
    }
}
