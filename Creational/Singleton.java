package Creational;

import java.util.ArrayList;

public class Singleton {
    public static void main(String[] args) {
        Game game1 = Game.getInstance();
        Game game2 = Game.getInstance();
        System.out.println(game1 == game2);
    }
}

class Game {
    static Game instance;
    private Game() {
        System.out.println("Game created");
    }
    public static Game getInstance() {
        if(instance == null) {
            instance = new Game();
        }
        return instance;
    }

}
