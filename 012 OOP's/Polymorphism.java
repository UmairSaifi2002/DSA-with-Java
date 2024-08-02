public class Polymorphism {

    public static void main(String[] args) {
        // Overloading
        Calculator calc = new Calculator();
        System.out.println(calc.sum(1,2));
        System.out.println(calc.sum(2.0, 3.5));
        System.out.println(calc.sum((float)2.1, (float)3.5));
        System.out.println(calc.sum(1, 2, 3));

        // Overriding
        Deer deer = new Deer();
        deer.eats();
    }
}

// Note:- Ploy -> Many, Morphisms -> Forms

// PolyMorphism have two different types
// 1, Compile time polymorphisms
// -> Method Overloading (Static type)
// 2, Run time polymorphisms
// -> Method Overriding (Dynamic type)

// Let's Dive into a Function Overloading
// Function Overloading -> Multiple function with same name but with different parameters

class Calculator  {
    int sum(int a, int b) {
        return a+b;
    }
    double sum(double a, double b){
        return a+b;
    }
    int sum(int a, int b, int c){
        return a+b+c;
    }
}

// Let's Dive into a function Overriding
// Function Overriding -> Parent and child both contains the same function with a different definition.

class Animal {
    void eats() {
        System.out.println("Eats anything.");
    }
}

class Deer extends Animal {
    void eats() {
        System.out.println("Eats grass.");
    }
}