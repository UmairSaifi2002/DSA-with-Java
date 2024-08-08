public class Quick_Sort {

    // Function to print the array
    public static void printArray(int arr[]) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void QuickSort(int arr[], int si, int ei) {
        // Base case
        if (si >= ei) {
            return;
        }
        // kaam
        // finding a pivot element index
        // finding the correct position of pivot index 
        int pivotIndex = partition(arr, si, ei);

        // Recursively Sort the first half
        QuickSort(arr, si, pivotIndex-1);

        // Recursively Sort the second half 
        QuickSort(arr, pivotIndex+1, ei);
    }

    public static int partition(int arr[], int si, int ei) {
        int pivot = arr[ei];
        int i = si-1; // to make place which is smaller than pivot

        // starting a loop
        for (int j = si; j < ei; j++) {
            if (arr[j] <= pivot) {
                i++;
                // swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        // now we placing the pivot element to its correct place
        i++;
        int temp = pivot;
        arr[ei] = arr[i]; // iski jagah ham pivot = arr[i] nhi likh sakte kyu ki 
        // pivot hamara ek variable h aur hame to changes array m krny h isiliye hamne essa likha h
        arr[i] = temp;
        return i;
    }

    public static void main(String[] args) {
        // Quick Sort
        int arr[] = {6, 3, 9, 8, 2, 5};
        QuickSort(arr, 0, arr.length-1);
        printArray(arr);
    }
}