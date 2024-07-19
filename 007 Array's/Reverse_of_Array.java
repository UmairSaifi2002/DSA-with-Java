// import java.util.*;

public class Reverse_of_Array {

    public static void swap(int arr[], int start, int end){
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void reverse_array(int arr[]) {
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < (arr.length/2) ; i++) {
            swap(arr, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4};
        int arr1[] = {1,2,3,4,5};
        reverse_array(arr);
        reverse_array(arr1);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");
        System.out.println();
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i]+" ");
    }
}