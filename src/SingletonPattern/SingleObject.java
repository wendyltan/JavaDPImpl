package SingletonPattern;

/**
 * Three steps to implement singleton pattern:
 *
 * First,make constructor private
 * Second,give it a private instance of itself
 * Third,make a static getInstance to get the object's instance
 *
 * Noted: When dealing with multi-thread condition,try using syncronized keyword.
 */
public class SingleObject {

    private static SingleObject instance = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstance(){
        return instance;
    }

    public void showMessage(){
        System.out.println("Hello world from singleton pattern!");
    }
}
