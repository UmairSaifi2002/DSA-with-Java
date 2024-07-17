import java.util.*;

public class Passing_Arguments_in_Array {

    @SuppressWarnings("resource")
    public static void Array_Passing(int marks[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the value of marks array");
        for (int i = 0; i < marks.length; i++) {
            marks[i] = scan.nextInt();
        }
    }

    public static void update(int marks[]) {
        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of an array");
        int size = scan.nextInt();
        int array[] = new int[size];
        System.out.println("Before calling the function");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "th element -> " + array[i]);
        }

        // Array pass as a parameter to the function
        Array_Passing(array); // here array is an argument
        System.out.println("After calling the function");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "th element -> " + array[i]);
        }

        // Array after the update function
        update(array);
        System.out.println("Array after the update function");
        for (int i = 0; i < array.length; i++) {
            System.out.println(i + "th element -> " + array[i]);
        }
    }
}
