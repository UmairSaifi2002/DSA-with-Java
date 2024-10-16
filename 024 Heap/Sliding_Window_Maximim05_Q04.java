import java.util.PriorityQueue;

public class Sliding_Window_Maximim05_Q04 {

    public class Info implements Comparable<Info>{
        int index;
        int value;
        Info(int index, int value){
            this.index = index;
            this.value = value;
        }
        @Override
        public int compareTo(Info I2) {
            // Ascending Order
            return this.value - I2.value;
            // Descending Order
            // return I2.value - this.value;
        }
    }

    public static void SlidingWindow(int arr[], int k){
        // step 1 create a Priority queue
        PriorityQueue<Info> pq = new PriorityQueue<>();
        for (int i = 0; i < k; i++) {
        }
    }

    public static void main(String[] args) {
        // sliding window probem
        int arr[] = {1, 3, -1, -3, 5, 3, 6, 7};
        int windowSize = 3;
        int result[] new int[arr.length-windowSize+1];
    }
}
