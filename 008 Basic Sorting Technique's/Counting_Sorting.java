public class Counting_Sorting {
    // Count sort
    public static int[] countingSort(int arr[]) {
        // initialize the max num with zero
        int max = arr[0];
        // finding the largest number in the array
        for (int i = 1; i < arr.length; i++) max = Math.max(max, arr[i]);
        
        // creating a count array length of max num + 1
        int count[] = new int[max + 1];
        // counting occurrences of each number
        for (int i = 0; i < arr.length; i++) count[arr[i]]++;
        
        // now create a result array length of array
        int result[] = new int[arr.length];
        int index = 0; // index for the result array
        
        // now we are applying count sort here
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                result[index++] = i;
                count[i]--;
            }
        }
        
        return result;
    }

    public static void main(String[] args) {
        int arr[] = {1, 4, 1, 3, 2, 4, 3, 7};
        int result[] = countingSort(arr);
        for (int i : result) System.out.print(i + " ");
    }
}
