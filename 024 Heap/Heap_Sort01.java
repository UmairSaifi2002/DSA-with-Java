public class Heap_Sort01 {
    // Method to maintain the heap property (used after removing an element)
    private static void heapify(int arr[], int i, int size) {
        int left = 2 * i + 1;  // Left child index
        int right = 2 * i + 2; // Right child index
        int maxIdx = i;        // Index of the smallest element (initially the parent itself)

        // Compare parent with the left child. If the left child is bigger, update minIdx
        if (left < size && arr[maxIdx] < arr[left]) {
            maxIdx = left;
        }

        // Compare minIdx (parent or left child) with the right child
        if (right < size && arr[maxIdx] < arr[right]) {
            maxIdx = right;
        }

        // If minIdx has changed, it means the heap property was violated
        // So, we swap the parent with the smaller child and continue to heapify
        if (maxIdx != i) {
            // Swap the parent with the smaller child
            int temp = arr[i];
            arr[i] = arr[maxIdx];
            arr[maxIdx] = temp;

            // Recursively heapify the affected subtree
            heapify(arr, maxIdx, size);
        }
    }

    public static void heapSort(int arr[]){
        //Step-1 build MaxHeap
        int size = arr.length;
        for (int i = size/2; i >= 0; i--) {
            heapify(arr, i, size);
        }

        // Step-2 Push largest at the End
        for (int i = size-1; i >= 0; i--) {
            // Swap the largest value(at 0th index) with last index value
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;

            // Call for heapify
            heapify(arr, 0, i);
        }
    }
    
    public static void main(String[] args) {
        // Max heap -> Ascending Order
        // Min heap -> Descending Order
        int arr[] = {1, 2, 4, 5, 3};
        heapSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
