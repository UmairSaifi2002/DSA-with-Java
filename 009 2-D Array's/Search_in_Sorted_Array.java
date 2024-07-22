import java.util.*;

public class Search_in_Sorted_Array {

    public static boolean OptimizedSearchInSortedArray(int arr[][], int key){
        int row = 0, col = arr[0].length - 1;
        while (row < arr.length && col >= 0) {
            if (arr[row][col] == key) {
                System.out.println("The key is found at ("+row+","+col+")");
                return true;
            }
            else if (key < arr[row][col]) {
                col--;
            }
            else{
                row++;
            }
        }
        System.out.println("The key is not found");
        return false;
    }

    public static boolean SearchInSortedArray(int arr[][], int key){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (key == arr[i][j]) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        int arr[][] = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int key = scan.nextInt();
        OptimizedSearchInSortedArray(arr, key);
    }
}