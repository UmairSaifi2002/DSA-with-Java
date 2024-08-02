public class Super_Keyword_in_OOP {

    public static void main(String[] args) {
        // Creating an instance of Animal
        Animal an = new Animal();
        // Printing the color property of Animal instance
        System.out.println(an.color);

        // Creating an instance of Horse
        Horse h = new Horse();
        // Printing the color property of Horse instance
        System.out.println(h.color);
    }
}

// Super Keyword in OOP
// It is used to refer to the immediate parent class object.
// Usage:
// 1. To access parent class properties.
// 2. To access parent class methods.
// 3. To call parent class constructors.

class Animal {
    // Property of Animal class
    String color = "White";

    // Constructor of Animal class
    Animal() {
        System.out.println("Animal Constructor is being called.");
    }
}

class Horse extends Animal {
    // Constructor of Horse class
    Horse() {
        // Call the parent (Animal) class constructor
        // This is implicit if not specified (i.e., super() is called by default)

        // Access and modify the parent class property using super keyword
        super.color = "Brown";
        System.out.println("Horse Constructor is being called.");
    }
}
