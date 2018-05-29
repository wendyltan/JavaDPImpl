package ObserverPattern;

/**
 * Concret class that extends Observer.
 * Has is own update method
 * Register and bind the subject when constructing.
 */
public class BinaryObserver extends Observer{

    public BinaryObserver(Subject subject){
        this.subject = subject;
        this.subject.registerObserver(this);
    }
    @Override
    public void update() {
        System.out.println( "Binary String: "+ Integer.toBinaryString(subject.getState()));
    }
}
