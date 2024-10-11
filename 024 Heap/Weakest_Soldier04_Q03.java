import java.util.PriorityQueue;

public class Weakest_Soldier04_Q03 {
    static class soldier implements Comparable<soldier>{
        int index;
        int soldierCount;
        soldier(int index, int soldierCount){
            this.index = index;
            this.soldierCount = soldierCount;
        }
        @Override
        public int compareTo(soldier s2) {
            if (this.soldierCount == s2.soldierCount) {
                return this.index - s2.index;
            }
            else return this.soldierCount - s2.soldierCount;
        }
    }
    public static void main(String[] args) {
        // Question Description
        // We are given an mxn binary matrix of 1's(soldiers) and 0'(civilians).
        // The soldiers are positioned in front of the civilians.
        // That is, all 1's will appear to the left of all the 0's in each row.

        // A row i is weaker than a row j if one of the following is true:
        // - The number of soldiers in row i is less than the number of soldiers in row j
        // - Both rows have the same number of soldiers and i<j
        // Fins the K weakest rows
        int arr[][]={{1, 0, 0, 0}, {1, 1, 1, 1}, {1, 0, 0, 0}, {1, 0, 0, 0}};
        PriorityQueue<soldier> p = new PriorityQueue<>();
        int k = 2;
        for (int i = 0; i < arr.length; i++) {
            int OneCount = 0;
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 1) {
                    OneCount++;
                }
            }
            p.add(new soldier(i, OneCount));
        }
        for (int i = 0; i < k; i++) {
            System.out.println("row"+p.remove().index);
        }
    }
}
