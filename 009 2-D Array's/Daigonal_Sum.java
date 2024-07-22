// import java.util.*;

public class Daigonal_Sum {

    public static int DaigonalSum(int arr[][]) {
        int sum = 0;
        int i=0,j=0;
        while(i<arr.length && j<arr.length){
            sum += arr[i][j];
            i++;
            j++;
        }
        i=0;
        j=arr.length-1;
        while (i < arr.length && j >= 0) {
            sum += arr[i][j];
            i++;
            j--;
        }
        return sum;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int matrix[][] = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int matrix1[][] = {{1,2},{3,4}};
        int result = DaigonalSum(matrix);
        int result1 = DaigonalSum(matrix1);
        System.out.println(result);
        System.out.println(result1);
    }
}