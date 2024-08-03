import java.util.*;

public class Print_Numbers {

    public static void DecreasingOrder(int n) {
        // Base Case
        if (n==0) return;
        // Print the number
        System.out.print(n+" ");
        // Recursion call for (n-1)
        DecreasingOrder(n-1);
    }

    public static void IncreasingOrder(int n) {
        // Base Case
        if (n==0) return;
        // Recursion call
        IncreasingOrder(n-1);
        // Print the number
        System.out.print(n+" ");
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.print("Decreasing Order : ");
        DecreasingOrder(num);
        System.out.println();
        System.out.print("Increasing Order : ");
        IncreasingOrder(num);
    }
}