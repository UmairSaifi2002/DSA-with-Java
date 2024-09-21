import java.util.*;

public class Fractional_KnapSack02 {
    public static void main(String[] args) {
        // it is a Fractional NapSack(by Greedy Algorithm) not 0-1 NapSack(by Dynamic Programming)
        // Given the weights and the values of N items, put these items in a NapSack of Capacity W
        // to get the Maximum total value in the NapSack
        int val[] = {60, 100, 120};
        int weight[] = {10, 20, 30};
        int W = 50;

        double ratio[][] = new double[val.length][2];
        // 0th col -> index
        // 1st col -> ratio
        for (int i = 0; i < ratio.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i]/(double)weight[i];
        }

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int capacity = W;
        int finalVal = 0;
        for (int i = ratio.length-1; i >= 0; i--) {
            int idx = (int)ratio[i][0];
            if (capacity >= weight[idx]) {
                finalVal += val[idx];
                capacity -= weight[idx];
            }
            else{
                finalVal += (ratio[i][1]*capacity);
                capacity = 0;
                break;
            }
        }
        System.out.println("Final Value = "+finalVal);
    }
}
