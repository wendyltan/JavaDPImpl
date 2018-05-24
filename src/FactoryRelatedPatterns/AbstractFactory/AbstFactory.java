package FactoryRelatedPatterns.AbstractFactory;

/**
 * define an abstract class to store all kinds of action
 * make different factory extends this class to overwrite the action needed and leave others alone.
 * Abstract factory indeed building a 'factory of many factories'...
 */
public abstract class AbstFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape);
}
