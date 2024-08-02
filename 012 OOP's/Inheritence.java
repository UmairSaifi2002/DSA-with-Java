public class Inheritence {

    public static void main(String[] args) {
        // Inheritance
        // It is when properties & methods of base class are passed on to a derived class.
        Fish shark = new Fish();
        shark.eat();
        shark.breath();
        shark.swim();

        Dog Doggy = new Dog();
        Doggy.eat();
        Doggy.legs = 4;
        System.out.println(Doggy.legs);
    }
}

// Parent class
class Animal {
    String color;
    
    void eat() {
        System.out.println("eats");
    }

    void breath(){
        System.out.println("Inhale O2 exhale CO2");
    }
}

// Derived class
class Fish extends Animal {
    int fins;

    void swim() {
        System.out.println("swims in water");
    }
}

// class for mammals
class Mammal extends Animal {
    int legs;

    void walk() {
        System.out.println("Mammals can walk.");
    }
}

// class for Birds
class Bird extends Animal {
    int wings;

    void fly() {
        System.out.println("Birds can Fly.");
    }
}

// class for Dog
class Dog extends Mammal {
    String breed;

    void age() {
        System.out.println("In Average Dog will live for 12 years.");
    }
}

// class for Cat
class Cat extends Mammal {
    String Breed;

    void Body() {
        System.out.println("Cats have Flexible Body.");
    }

    void reflexes() {
        System.out.println("Cats have Very Quick Reflexes.");
    }
} 

// class for Humans
class Humans extends Mammal {
    int languages;

    void mind() {
        System.out.println("Humans have Concious mind.");
    }

    void language() {
        System.out.println("Humans can Speaks Different Languages.");
    }
}