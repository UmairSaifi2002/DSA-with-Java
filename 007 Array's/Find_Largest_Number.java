import java.util.*;

public class Find_Largest_Number {

    public static int largest_number(int array[]){
        // int largest = Integer.MIN_VALUE; // -> -Infinity
        int largest = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        return largest;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of "+i+"th index : ");
            array[i] = scan.nextInt();
        }
        int result = largest_number(array);
        System.out.println("The largest number of an array is : "+result);
    }
}
