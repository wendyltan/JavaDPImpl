package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * This class used for observer binding or unbinding.
 * Holding many observers and notify them at right time
 */
public class Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer:observers){
            observer.update();
        }
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
}
