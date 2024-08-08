public class Sort_String_Array {

    public static void mergeSort(String arr[], int si, int ei) {
        if (si >= ei) {
            return;
        }
        int mid = si + (ei-si)/2;
        mergeSort(arr, si, mid);
        mergeSort(arr, mid+1, ei);
        merge(arr, si, mid, ei);
    }

    public static void merge(String arr[], int si, int mid, int ei) {
        String temp[] = new String[ei-si+1];
        int leftIndex = si;
        int rightIndex = mid+1;
        int tempIndex = 0;
        while(leftIndex <= mid && rightIndex <= ei) {
            if (arr[leftIndex].compareTo(arr[rightIndex]) > 0) {
                temp[tempIndex] = arr[rightIndex];
                // System.out.println(" -> "+temp[tempIndex]);
                rightIndex++;
            }
            else {
                temp[tempIndex] = arr[leftIndex];
                // System.out.println(" --> "+temp[tempIndex]);
                leftIndex++;
            }
            // System.out.print(temp[tempIndex]+",");
            tempIndex++;
        }
        while (leftIndex <= mid) {
            temp[tempIndex++] = arr[leftIndex++];
        }
        while (rightIndex <= ei) {
            temp[tempIndex++] = arr[rightIndex++];
        }

        for (int i = 0; i < temp.length; i++) {
            arr[si+i] = temp[i];
            // System.out.print(temp[i]+",");
        }
    }

    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        String str[] = {"sun", "earth", "mars", "mercury", "sun", "earth"};
        mergeSort(str, 0, str.length-1);
        printArray(str);
    }
}