import java.util.*;

public class Find_Maximum {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(0);
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);

        // finding the greatest element in ArrayList
        int max = List.get(0);
        System.out.println(max);
        for (int i = 0; i < List.size(); i++) {
            if (max < List.get(i)) { // Check for the greater Element
                max = List.get(i);
            }
        }

        System.out.println("The Greatest Element is -> "+max);
    }
}