package StrategyPattern;

/**
 * Make a a class contain the Strategy interface.
 * Use this class to wrap up interface's action.
 * All you have to pass in is the implemented class instance.
 * One context object for many strategy uses.(Switching between lots! of strategy)
 * Avoid if-else pairs.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1,int num2){
        return strategy.doOperation(num1,num2);
    }
}
