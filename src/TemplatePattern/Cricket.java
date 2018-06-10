package TemplatePattern;

public class Cricket extends Game {
    @Override
    void initialize() {
        System.out.println("Cricket init! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Circket Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Cricket Game Finished!");
    }
}
