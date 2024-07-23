// import java.util.*;

public class Tranpose_of_a_Matrix {

    public static int[][] Tranpose(int arr[][]){
        int n = arr[0].length;
        int m = arr.length;
        int transpose[][]= new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                transpose[i][j] = arr[j][i];
            }
        }
        return transpose;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int arr[][] ={{1,2,3},{11,22,33}};
        int result[][] = Tranpose(arr);
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result[0].length; j++) {
                System.out.print(result[i][j]+" ");
            }
            System.out.println();
        }
    }
}