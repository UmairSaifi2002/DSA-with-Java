// import java.util.*;

public class SubArray_of_Array {
    public static void subarrayOfArray (int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                for (int j2 = i; j2 <= j; j2++) {
                    System.out.print(arr[j2]+" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4,5};
        subarrayOfArray(arr);
    }
}