import java.util.*;

public class Beautiful_ArrayList {

    public static ArrayList<Integer> beautifulArray(int n) {
        // Initialize the result ArrayList with the first element 1
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(1);
    
        // Iterate from 2 to n (inclusive)
        for (int i = 2; i <= n; i++) {
            // Create a temporary ArrayList to store the new elements
            ArrayList<Integer> temp = new ArrayList<>();
    
            // Add the doubled elements from the previous result
            for (Integer e : ans) { // for (int j = 0; j < ans.size(); j++)
                if (2 * e <= n) { // Check if the doubled element is within the range [1, n]
                    // System.out.println(e * 2);
                    temp.add(e * 2);
                }
            }
    
            // Add the doubled-minus-one elements from the previous result
            for (Integer e : ans) { // for (int j = 0; j < ans.size(); j++)
                if (2 * e - 1 <= n) { // Check if the doubled-minus-one element is within the range [1, n]
                    // System.out.println(e * 2 - 1);
                    temp.add(e * 2 - 1);
                }
            }
            System.out.println(temp);
            // Update the result ArrayList with the new elements
            ans = temp;
        }
    
        // Return the final beautiful ArrayList
        return ans;
    }
    

    public static void main(String[] args) {
        int n = 5;
        System.out.println(beautifulArray(n));
        
    }
}