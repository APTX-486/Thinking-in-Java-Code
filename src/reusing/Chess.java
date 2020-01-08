package reusing;

class Game {
    Game(int i) {
        System.out.println("Game constructor");
    }
//    Game() {
//        System.out.println("Game constructor");
//    }
}

class BoardGame extends Game {
    BoardGame(int i) {
        super(i);  // if the base constructor has args, the extended class must call the base
        // constructor
        System.out.println("BoardGame constructor");
    }
}

public class Chess extends BoardGame {
    Chess() {
        super(11);
        System.out.println("Chess constructor");
    }

    public static void main(String[] args) {
        Chess x = new Chess();
    }
}
