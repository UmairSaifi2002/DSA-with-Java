import java.util.*;

public class isMonotic_ArrayList {

    public static boolean isMonotic(ArrayList<Integer> List) {
        for (int i = 0; i < List.size() - 1; i++) {
            if (List.get(i) > List.get(i+1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); // That's how we declare ArrayList

        // Adding Element in ArrayList O(1)
        // in Integer ArrayList
        List.add(1);
        List.add(2);
        List.add(2);
        List.add(4);
        List.add(5);

        boolean result = isMonotic(List);
        if (result) {
            System.out.println("Your ArrayList is Monotonic in nature");
        }
        else {
            System.out.println("Your ArrayList is not a Monotonic in nature");
        }
    }
}