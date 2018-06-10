package TemplatePattern;

/**
 * Customize your fix structure and shared methods
 * and leave those abstract method to be implemented.
 */
public abstract class Game {
    //method watting to be implemented by subclass
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();

    /**
     * Pre-define fix structure
     */
    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }
}
