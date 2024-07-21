// import java.util.*;

public class Trapping_RainWater_Problem {

    public static int Trap_Rainwater(int arr[]) {

        // ***************************** By Me ****************************
        // here we are making arrays which stores right and left highest boundry
        // int n = arr.length;
        // int right[] = new int[n];
        // int left[] = new int[n];
        // right[n - 1] = arr[n - 1];
        // left[0] = 0;

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < i; j++)  right[i] = right[i] < arr[j] ? arr[j] : right[i];
        //     for (int j = i; j < n; j++)  left[i] = left[i] < arr[j] ? arr[j] : left[i];
        // }

        // for (int i = 0; i < n; i++) System.out.print(right[i]+" ");
        // System.out.println();
        // for (int i = 0; i < n; i++) System.out.print(left[i]+" ");

        // now we gonna calculate the trapped water 
        // water_level = ((Math.min(right[i], left[i])) - arr[i]);
        // we are using formula :- trap_water = water level - height of a current bar

        // int water_level = 0;
        // int trapped_water = 0;
        // for (int i = 0; i < n; i++) {
        //     water_level = ((Math.min(right[i], left[i])) - arr[i]);
        //     if (water_level > 0) {
        //         trapped_water += water_level ;
        //     } 
        // }

        // return trapped_water;

        
        // ***************************** By Teacer ****************************
        int n = arr.length;

        // Calculate left most boundary - array
        int leftMax[] = new int[n];
        leftMax[0] = arr[0];
        for (int i = 0; i < n; i++) leftMax[i] = Math.max(arr[i], leftMax[i-1]);

        // calculate right most boundary - array
        int rightMax[] = new int[n];
        rightMax[n-1] = arr[n-1];
        for (int i = n-2; i > 0; i--) rightMax[i] = Math.max(arr[i], rightMax[i+1]);

        int trapped_water = 0;
        int water_level;
        // loop
        for (int i = 0; i < n; i++) {
            // water_level = min(leftmax bound, rightmax bound)
            water_level = Math.min(leftMax[i], rightMax[i]);
            // trapped_water += water_level - arr[i]
            trapped_water += water_level - arr[i];
        }

        return trapped_water;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[] = {4,2,0,6,3,2,5};
        int result = Trap_Rainwater(arr);
        System.out.println("You can Trap "+result+" liters of RainWater.");
    }
}