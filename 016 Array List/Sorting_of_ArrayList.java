import java.util.*;

public class Sorting_of_ArrayList {

    public static void sort(ArrayList<Integer> List) {
        // for Ascending Order
        Collections.sort(List);
        System.out.println(List);

        // for Descending Order
        Collections.sort(List, Collections.reverseOrder());
        System.out.println(List);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(5);
        List.add(2);
        List.add(8);
        List.add(4);
        List.add(1);
        System.out.println(List);
        sort(List);
    }
}