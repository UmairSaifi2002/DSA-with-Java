import java.util.*;

public class Swap_Two_Elements {

    public static void Swapp(ArrayList<Integer> List, int indexOne, int indexTow){
        // Swapping two Elements
        // Like i want to swap Elements of index 0 & index 5
        int temp = List.get(indexOne);
        List.set(0,List.get(indexTow));
        List.set(5,temp);
        System.out.println(List); // -> [5, 1, 2, 3, 4, 0]
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        System.out.println(List); // -> [0, 1, 2, 3, 4, 5]

        Swapp(List, 0, 5);
        }
}