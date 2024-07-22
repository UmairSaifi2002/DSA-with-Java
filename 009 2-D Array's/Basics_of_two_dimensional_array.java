import java.util.*;

public class Basics_of_two_dimensional_array {

    public static void print(int matrix[][]){
        // print the 2-D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static boolean search(int matrix[][], int key) {
        // serching a key in given array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == key) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);

        // defining a 2-D array
        int matrix[][] = new int[3][3];

        // setting the values to each cell of the 2-D array
        for (int i = 0; i < matrix.length; i++) {
            System.out.println("Enter your "+i+"st row values");
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scan.nextInt();
            }
        }

        print(matrix);

        boolean result = search(matrix, 5);
        if (result) {
            System.out.println("Your Key is found successfully");
        } else {
            System.out.println("Key is not found");
        }

        // System.out.println(matrix.length);
        // System.out.println(matrix[1].length);
    }
}