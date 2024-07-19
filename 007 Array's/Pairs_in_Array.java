// import java.util.*;

public class Pairs_in_Array {
    public static void pairs(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
        }
    }
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {1,2,3,4};
        pairs(arr);
    }
}