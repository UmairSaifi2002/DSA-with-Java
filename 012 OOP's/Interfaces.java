public class Interfaces {

    public static void main(String[] args) {
        // implementing interfaces
        Queen q = new Queen();
        q.moves();

        King k = new King();
        k.moves();

        Rook r = new Rook();
        r.moves();

        Bear b = new Bear();
        b.eats();
    }
}

// Notes :-
// Interfaces
// All Methods are public, abstract & without implementation
// Used to achieve total abstraction
// Variable in the interface is final, public & static.

// Here we are learn about Total Abstraction
interface ChessPlayer {
    void moves();
}

class Queen implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, left, right, daigonal(in all 4 direction.)");
    }
}

class Rook implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, left, right)");
    }
}

class King implements ChessPlayer {
    public void moves() {
        System.out.println("Up, Down, left, right, daigonal(in all 4 direction by 1 step.)");
    }
}

// Multiple inheritance
interface Herbivore {
    void eats();
}

interface Carnivore {
    void eats();
}

class Bear implements Herbivore, Carnivore {
    public void eats() {
        System.out.println("Bear can eat both Green plants and flash");
    }
}