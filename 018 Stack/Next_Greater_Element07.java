import java.util.*;

public class Next_Greater_Element07 {

    public static void Greater(int arr[], int nextGreater[]) {
        Stack<Integer> s = new Stack<>();
        for (int i = arr.length-1; i >= 0; i--) {
            while (!s.isEmpty() && (s.peek() <= arr[i])) {
                s.pop();
            }
            if (s.isEmpty()) {
                nextGreater[i] = -1;
                s.push(arr[i]);
            }
            else {
                nextGreater[i] = s.peek();
                s.push(arr[i]);
            }
            // System.out.println(s);
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 8 , 0, 1, 3};
        int nextGreater[] = new int[arr.length];
        Greater(arr, nextGreater);
        for (int i = 0; i < nextGreater.length; i++) {
            System.out.print(nextGreater[i]+", ");
        }
    }
}
