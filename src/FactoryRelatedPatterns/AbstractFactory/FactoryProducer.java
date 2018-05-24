package FactoryRelatedPatterns.AbstractFactory;

/**
 * Get different factory by string choice.Then use the choosen factory's service.
 */
public class FactoryProducer {
    public static AbstFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;

    }
}
