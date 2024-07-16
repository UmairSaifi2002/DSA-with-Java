import java.util.*;

public class Basics_of_Arrays {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(n);
        //********************************** Creation of an Array **********************************
        // dataType arrayNAme[] = new dataType[size];
        int marks[] = new int[50];
        int numbers[] = { 1, 2, 3, 4, 5 };
        int moreNumbers[] = { 6, 7, 8, 9, 10 };
        String fruits[] = { "apple", "mango", "orange", "pineapple" };
        // Declaration and creation of an array of integers with a size of 5
        int[] array = new int[5];

        // Alternatively, you can initialize an array with values at the time of creation
        int[] arrayWithValues = { 1, 2, 3, 4, 5 };

        //********************************** Input in an Array **********************************
        int[] array1 = new int[5];

        // Assigning values to the array
        array1[0] = 10;
        array1[1] = 20;
        array1[2] = 30;
        array1[3] = 40;
        array1[4] = 50;

        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter value for element " + i + ": ");
            array[i] = scan.nextInt();
        }

        // ********************************** Ouput in an Array ******************************
        // // Printing values using indices
        System.out.println(array[0]); // Output: 10
        System.out.println(array[1]); // Output: 20

        // Printing values using a loop
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element at index " + i + ": " + array[i]);
        }

        // ********************************* Updation of an Array *****************************
        // Updating values at specific indices
        array[0] = 100;
        array[1] = 300;

        // Printing updated array
        for (int i = 0; i < array.length; i++) {
            System.out.println(
                "Updated element at index " + i + ": " + array[i]
            );
        }
    }
}
