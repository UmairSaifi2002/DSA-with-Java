public class isSortred {

        public static boolean Sorted(int arr[], int i) {
        if (i == arr.length-1) {
            return true;
        }
        if (arr[i]>arr[i+1]) {
            return false;
        }
        return Sorted(arr, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 10, 9};
        boolean one = Sorted(arr, 0);
        System.out.println(one);
        boolean two = Sorted(arr1, 0);
        System.out.println(two);
    }
}