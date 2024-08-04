public class Last_Occurence_of_an_Element_in_Array {

    public static int LastOccurence(int arr[], int key, int i) {
        if (i < 0) return -1;
        if (arr[i] == key) return i;
        return LastOccurence(arr, key, i-1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,4};
        int key = 4;
        int size = arr.length-1;
        int index = LastOccurence(arr, key, size);
        System.out.println(index);
    }
}