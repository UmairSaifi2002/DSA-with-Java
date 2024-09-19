import java.util.*;
import java.util.LinkedList;

public class Q1_DecimalToBinary {

    public static String Convert(int n){
        String result = "";
        while (n>0) {
            result = (n%2)+result;
            // System.out.println(result);
            n = n/2;
        }
        
        // System.out.println(result);
        return result;
    }

    public static void DTB(int n){
        Deque<Integer> q = new LinkedList<>();
        for (int i = 1; i <= n; i++) {
            q.add(i);
        }
        // System.out.println(q);
        while (!q.isEmpty()) {
            System.out.print(Convert(q.peek())+" ");
            q.remove();
        }
    }
    public static void main(String[] args) {
        int n = 5;
        DTB(n);
        // Convert(n);
    }
}
