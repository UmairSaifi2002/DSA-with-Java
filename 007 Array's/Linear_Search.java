// import java.util.*;

public class Linear_Search {

    public static int linear_search(int array[], int key) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
        int key = 6;
        int result = linear_search(array, key);
        System.out.println("The Key present on " + result + "th index");
    }
}
