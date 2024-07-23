// import java.util.*;

public class Spiral_Matrix {

    public static void spiralPrint(int arr[][]) {
        int startrow = 0;
        int startcol = 0;
        int endrow = arr.length-1;
        int endcol = arr.length-1;

        while(startrow <= endrow && startcol <= endcol) {
            // top
            for (int j = startcol; j <= endcol; j++) {
                System.out.print(arr[startrow][j]+" ");
            }

            // right
            for (int i = startrow+1; i <= endrow; i++) {
                System.out.print(arr[i][endcol]+" ");
            }
            // yaha bottom or left m hamne ek check lagaya h kyuki jab bhi hame koi 2-D array
            // milti h agr usme center m sirf ek hi value bachti h
            // to sirf us case k liy hamne y check lagaya h
            // like 3X3 or 5X5
            
            // bottom
            for (int j = endcol - 1; j >= startcol ; j--) {
                if (startrow == endrow) {
                    break;
                }
                System.out.print(arr[endrow][j]+" ");
            }

            //left
            for (int i = endrow-1; i >=  startrow+1; i--) {
                if (startcol == endcol) {
                    break;
                }
                System.out.print(arr[i][startcol]+" ");
            }
            startcol++;
            startrow++;
            endcol--;
            endrow--;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int spiral[][] = {{1,2,3,4},
                          {5,6,7,8},
                          {9,10,11,12},
                          {13,14,15,16}
                         };
        int spiral1[][] = {{1,2,3}, {5,6,7}, {9,10,11} };
        spiralPrint(spiral);
        spiralPrint(spiral1);
    }
}