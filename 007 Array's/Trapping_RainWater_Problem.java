// import java.util.*;

public class Trapping_RainWater_Problem {

    public static int Trap_Rainwater(int arr[]) {

        // here we are making arrays which stores right and left highest boundry
        int right[] = new int[arr.length];
        int left[] = new int[arr.length];
        right[0] = 0;
        left[0] = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < i; j++)  right[i] = right[i] < arr[j] ? arr[j] : right[i];
            for (int j = i; j < left.length; j++)  left[i] = left[i] < arr[j] ? arr[j] : left[i];
        }
        // for (int i = 0; i < right.length; i++) System.out.print(right[i]+" ");
        // System.out.println();
        // for (int i = 0; i < left.length; i++) System.out.print(left[i]+" ");

        // now we gonna calculate the trapped water 
        // we are using formula :- trap_water = water level - height of a current bar

        int water_level = 0;
        int trapped_water = 0;
        for (int i = 0; i < arr.length; i++) {
            water_level = ((Math.min(right[i], left[i])) - arr[i]);
            if (water_level > 0) {
                trapped_water += water_level ;
            } 
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