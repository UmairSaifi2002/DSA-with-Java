// import java.util.*;

public class Bubble_Sorting {

    public static void swap(int arr[],int a,int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void bubleSort(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    // int temp = arr[i];
                    // arr[i] = arr[j];
                    // arr[j] = temp;
                    swap(arr, i, j);
                }
            }
        }
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {5,4,1,3,2};
        bubleSort(arr);
        for (int i = 0; i < arr.length; i++) System.out.print(arr[i]+" ");

        int arr1[] = {9,8,7,6,5,4,3,2,1};
        bubleSort(arr1);
        for (int i = 0; i < arr1.length; i++) System.out.print(arr1[i]+" ");
    }
}