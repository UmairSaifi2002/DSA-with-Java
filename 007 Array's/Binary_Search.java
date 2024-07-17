import java.util.*;

public class Binary_Search {
    public static int binary_search(int array[], int key) {
        int start = 0;
        int end = array.length - 1;
        while(start <= end){
            int mid = (start + end)/2;
            if (key == array[mid]) return mid;
            if (key < array[mid]) end = mid -1 ;
            else start = mid + 1;
        }
        return -1;
    }
    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = scan.nextInt();
        int array[] = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter the value of "+i+"th index : ");
            array[i] = scan.nextInt();
        }
        System.out.print("Enter the key : ");
        int key = scan.nextInt();
        int result = binary_search(array, key);
        if (result == -1) {
            System.out.println("key is not Found!!");
        }
        else System.out.println("key Founded at "+result+"th index");
    }
}