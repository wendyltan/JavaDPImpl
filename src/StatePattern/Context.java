package StatePattern;

/**
 * In fact this is a state machine.Set its state when condition changes.
 */
public class Context {

    //Store a member of State object
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
