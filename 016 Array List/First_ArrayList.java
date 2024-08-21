import java.util.*; // This '*' is for all
// means importing javas all utilities

public class First_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> List0 = new ArrayList<>(); // That's how we declare ArrayList
        ArrayList<String> List1 = new ArrayList<>();
        ArrayList<Boolean> List2 = new ArrayList<>();

        // Adding Element in ArrayList O(1)
        // in Integer ArrayList
        List0.add(1);
        List0.add(2);
        List0.add(3);
        List0.add(4);
        List0.add(5);

        // Adding an element on specific index    O(n)
        List0.add(5,6);

        // in String ArrayList
        List1.add("Mohammad");
        List1.add("umair");
        List1.add("saifi");
        List1.add("is");
        List1.add("here");
        // in Boolean ArrayList
        List2.add(true);
        List2.add(true);
        List2.add(false);
        List2.add(false);
        List2.add(true);

        // Print the ArrayList
        System.out.println(List0); // -> [1, 2, 3, 4, 5, 6]
        System.out.println(List1); // -> [Mohammad, umair, saifi, is, here]
        System.out.println(List2); // -> [true, true, false, false, true]

        // Getting an Element    O(1)
        int element = List0.get(2);
        System.out.println(element); // -> 3
        String one = List1.get(1);
        System.out.println(one); // -> umair

        // Removing an Element from the ArrayList    O(n)
        List0.remove(3);
        System.out.println(List0); // -> [1, 2, 3, 5, 6]

        // Setting Element at index
        List0.set(0, 4);
        System.out.println(List0); // -> [4, 2, 3, 5, 6]

        // Checking an Element to the target value
        System.out.println(List1.contains("umair")); // -> true
        System.out.println(List0.contains(11)); // -> false

        // Size of an ArrayList
        System.out.println(List0.size());
        System.out.println(List1.size());
        System.out.println(List2.size());
    }
}