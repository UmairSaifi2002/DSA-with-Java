import java.util.*;

public class Lonely_Numbers {

    public static void LonelyNumber(ArrayList<Integer> List) {
        ArrayList<Integer> solution = new ArrayList<>();
        for (int i = 0; i < List.size(); i++) {
            boolean ans = false;
            for (int j = 0; j < List.size(); j++) {
                if (i == j) {
                    continue;
                }
                if (List.get(i)-1 == List.get(j) || List.get(i)+1 == List.get(j)) {
                    ans = true;
                }
            }
            if (!ans) {
                solution.add(List.get(i));
            }
        }
        System.out.println(solution);
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>(); // That's how we declare ArrayList

        // Adding Element in ArrayList O(1)
        // in Integer ArrayList
        List.add(10);
        List.add(6);
        List.add(5);
        List.add(8);
        List.add(4);
        LonelyNumber(List);
    }
}