public class ConstructorDemo {

    public static void main(String[] args) {
        // Using the non-parameterized constructor
        CustomConstructor obj1 = new CustomConstructor();
        System.out.println("obj1.a: " + obj1.getA()); // -> 4

        // Using the parameterized constructor
        int[] array = new int[3];
        CustomConstructor obj2 = new CustomConstructor(1, 2, 3, array);
        System.out.println("obj2.b: " + obj2.getB()); // -> 2

        // Using the shallow copy constructor
        CustomConstructor obj3 = new CustomConstructor(obj2); // Shallow copying obj2's values
        obj2.setB(100);
        System.out.println("obj3.a: " + obj3.getA()); // -> 1

        // Modifying obj2 values
        obj2.setA(50);
        obj2.setB(60);
        obj2.setC(70);
        System.out.println("obj2 values: " + obj2.getA() + "," + obj2.getB() + "," + obj2.getC());

        // Using the deep copy constructor
        CustomConstructor obj4 = new CustomConstructor(obj2, true); // Deep copying obj2's values
        obj2.setB(200);
        System.out.println("obj4.b (deep copy): " + obj4.getB()); // -> 60
    }
}

class CustomConstructor {
    private int a;
    private int b;
    private int c;
    private int[] array;

    // Non-Parameterized Constructor: Initializes an object with default values.
    CustomConstructor() {
        this.array = new int[3];
        this.a = 4;
        this.b = 0;
        this.c = 0;
    }

    // Parameterized Constructor: Initializes an object with specific values provided as arguments.
    CustomConstructor(int a, int b, int c, int[] array) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.array = new int[array.length];
        System.arraycopy(array, 0, this.array, 0, array.length);
    }

    // Shallow Copy Constructor: Creates a new object as a shallow copy of an existing object.
    CustomConstructor(CustomConstructor other) {
        this.a = other.a;
        this.b = other.b;
        this.c = other.c;
        this.array = other.array; // Shallow copy of the array
    }

    // Deep Copy Constructor: Creates a new object as a deep copy of an existing object.
    CustomConstructor(CustomConstructor other, boolean deepCopy) {
        if (deepCopy) {
            this.a = other.a;
            this.b = other.b;
            this.c = other.c;
            this.array = new int[other.array.length];
            System.arraycopy(other.array, 0, this.array, 0, other.array.length);
        } else {
            // If not deep copying, default to shallow copy
            this.a = other.a;
            this.b = other.b;
            this.c = other.c;
            this.array = other.array;
        }
    }

    // Getter and Setter methods for a
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    // Getter and Setter methods for b
    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    // Getter and Setter methods for c
    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    // Getter and Setter methods for array
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }
}
