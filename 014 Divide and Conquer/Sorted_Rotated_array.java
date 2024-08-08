public class Sorted_Rotated_array {

    public static int search(int arr[], int target, int si, int ei){
        // when the target is not present.
        if (si > ei) {
            return -1;
        }

        // finding middle index
        int mid = si + (ei-si)/2;

        // target Found
        if (arr[mid] == target) {
            return mid;
        }

        // mid on L1
        if (arr[si] <= arr[mid]) {
            // left
            if (arr[si] <= target && target <= arr[mid]) {
                return search(arr, target, si, mid-1);
            }
            // right
            else {
                return search(arr, target, mid+1, ei);
            }
        }

        // mid on L2
        else {
            // right
            if (arr[mid] <= target && target <= arr[ei]) {
                return search(arr, target, mid+1, ei);
            }
            // left
            else {
                return search(arr, target, si, mid-1);
            }
        }
            
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int target_index = search(arr, target, 0, arr.length-1);
        System.out.println(target_index);
    }
}