import java.util.*;

public class Stock_Span_Problem06 {

    // Method to calculate the stock span for each day
    public static void stockSpan(int stocks[], int span[]) {
        // Create a Stack to store indices of previous days
        Stack<Integer> s = new Stack<>();

        // Initialize span for the first day as 1
        span[0] = 1;
        // Push the index of the first day onto the Stack
        s.push(0);

        // Iterate through the remaining days
        for (int i = 1; i < stocks.length; i++) {
            // Get the current stock price 
            int currPrice = stocks[i];

            // While the Stack is not empty and the current price is greater than the price
            // at the top of the Stack
            while (!s.isEmpty() && currPrice > stocks[s.peek()]) {
                // Pop the index from the Stack (remove the previous day)
                s.pop();
            }

            // If the Stack is empty, the span is the current day's index plus 1
            if (s.isEmpty()) {
                span[i] = i + 1;
            } else {
                // Get the index of the previous day with a higher price
                int prevHigh = s.peek();
                // Calculate the span as the difference between the current day's index and the
                // previous day's index
                span[i] = i - prevHigh;
            }

            // Push the current day's index onto the Stack
            s.push(i);
        }
    }

    public static void main(String[] args) {
        int stocks[] = { 100, 80, 60, 70, 60, 85, 100 };
        int span[] = new int[stocks.length];
        stockSpan(stocks, span);

        for (int i = 0; i < span.length; i++) {
            System.out.println(span[i]);
        }
    }
}
