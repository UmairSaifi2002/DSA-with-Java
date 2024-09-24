public class WatchGlass{

    public static void patternPrint(int n){
        int right = 1, left = 2*n;
        // First Half
        for (int i = 0; i < n; i++) {
            // for spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            // for number
            for (int j = right; j < left; j++) {
                System.out.print(j);
            }
            right++;
            left--;
            System.out.println();
        }

        // Second Half
        right = n-1;
        left = n+1;
        for (int i = n-1; i > 0; i--) {
            // for spaces
            for (int j = i-1; j > 0; j--) {
                System.out.print(" ");
            }
            // for numbers
            for (int j = right; j <= left; j++) {
                System.out.print(j);
            }
            right--;
            left++;
            System.out.println();
        }
    }

    public static void main (String[] args){
        int n = 2;
        patternPrint(n);
    } 
} 


// *****
//  ***
//   *
//  ***
// *****
