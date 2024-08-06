public class Count_Occurence_of_an_Element {

    public static int AllOccurence(int arr[], int key, int i, int count) {
        // Base Case
        if (i == arr.length) {
            System.out.println();
            return count;
        }
        // work
        if (arr[i] == key) {
            count++;
            System.out.print(i+" ");
        }
        // recursive call
        return AllOccurence(arr, key, i+1, count);
    }

    public static void main(String[] args) {
        int arr[] = {3,2,4,5,6,2,7,2,2};
        int key = 2;
        System.out.println("The Occurrence of "+key+" in an array");
        System.out.println(key+" occurs "+AllOccurence(arr, key, 0, 0)+" times");
    }
}