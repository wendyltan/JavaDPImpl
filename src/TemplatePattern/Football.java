package TemplatePattern;

public class Football extends Game {
    @Override
    void initialize() {
        System.out.println("Football init! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }

    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }
}