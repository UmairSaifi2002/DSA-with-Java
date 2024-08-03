public class Firt_Occurence_of_an_Element_in_Array {

    public static int FirstOccurence(int arr[], int key, int i) {
        if (i == arr.length-1) return -1;
        if (arr[i] == key) return i;
        return FirstOccurence(arr, key, i+1);
    }

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,4};
        int key = 4;
        int index = FirstOccurence(arr, key, 0);
        System.out.println(index);
    }
}