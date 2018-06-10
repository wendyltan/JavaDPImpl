package StatePattern;

/**
 * Has the method to allow context to set the state to current state.
 */
public interface State {
    void doAction(Context context);
}
