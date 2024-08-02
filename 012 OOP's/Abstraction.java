public class Abstraction {

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.eat();
        horse.walk();
        horse.changeColor("Dark Brown");
        System.out.println(horse.color);

        Chicken ch = new Chicken();
        ch.eat();
        ch.walk();
        ch.changeColor("Black");
        System.out.println(ch.color);

        Mustang myhorse = new Mustang();
        myhorse.eat();
        // Animal -> Horse -> Mustang
    }
}

// Notes
// Abstraction Class
// - Cannot Create an instance/ Objects of abstract class
// - Can have abstract/ non-abstract methods
// - can have Constructor

abstract class Animal {
    String color;
    Animal() {
        color = "Brown";
        System.out.println("Animal constructor called");
    }
    void eat() {
        System.out.println("animal eats");
    }
    // Abstraction 
    // it gives idea which is implemented by its child instances
    abstract void walk();
}

class Horse extends Animal {
    // String color;
    Horse() {
        System.out.println("Horse Constructor is called");
    }
    void changeColor(String color) {
        this.color = color;
    }
    void walk() {
        System.out.println("Walks on 4 legs.");
    }
}

class Mustang extends Horse {
    Mustang() {
        System.out.println("Mustang Constructor called!");
    }
    void eat() {
        System.out.println("Mustang Eats Grass, many more.");
    }
}

class Chicken extends Animal {
    // String color;
    void changeColor(String color) {
        this.color = color;
    }
    void walk() {
        System.out.println("Walks on 2 legs.");
    }
}