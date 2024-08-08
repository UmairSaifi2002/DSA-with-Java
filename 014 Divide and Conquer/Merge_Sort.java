public class Merge_Sort {

    // Function to print the array
    public static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    // Main function that sorts the array
    public static void mergeSort(int arr[], int start, int end) {
        // Base case: If the array has one or no element, it's already sorted
        if (start >= end) {
            return;
        }
  
        // Find the middle point
        int middle = start + (end - start) / 2;

        // Recursively sort the first half
        mergeSort(arr, start, middle);

        // Recursively sort the second half
        mergeSort(arr, middle + 1, end);

        // Merge the sorted halves
        merge(arr, start, middle, end);
    }

    // Function to merge two sorted subarrays
    public static void merge(int arr[], int start, int middle, int end) {
        // Create a temporary array to hold the merged subarrays
        int[] temp = new int[end - start + 1];

        // Initialize pointers for the left and right subarrays
        int leftIndex = start;
        int rightIndex = middle + 1;
        int tempIndex = 0;

        // Merge the two subarrays into the temp array
        while (leftIndex <= middle && rightIndex <= end) {
            if (arr[leftIndex] <= arr[rightIndex]) {
                temp[tempIndex] = arr[leftIndex];
                leftIndex++;
            } else {
                temp[tempIndex] = arr[rightIndex];
                rightIndex++;
            }
            tempIndex++;
        }

        // Copy remaining elements from the left subarray, if any
        while (leftIndex <= middle) {
            temp[tempIndex++] = arr[leftIndex++];
        }

        // Copy remaining elements from the right subarray, if any
        while (rightIndex <= end) {
            temp[tempIndex++] = arr[rightIndex++];
        }

        // Copy the merged elements back into the original array
        // Copy the merged elements from the temp array back to the original array
        // 'start + i' ensures that elements are placed in their correct positions in the original array
        // starting from the 'start' index and moving sequentially to 'end'
        for (int i = 0; i < temp.length; i++) {
            arr[start + i] = temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[] = {6, 3, 9, 5, 2, 8};
        System.out.println("Original array:");
        printArray(arr);
        
        mergeSort(arr, 0, arr.length - 1);
        
        System.out.println("Sorted array:");
        printArray(arr);
    }
}
