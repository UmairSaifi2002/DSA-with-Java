import java.util.*;

public class Two_Dimensional_ArrayList {

    public static void main(String[] args) {
        // That's how we define the 2-D ArrayList
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        // We are Creating 1-D ArrrayList
        ArrayList<Integer> List0 = new ArrayList<>();
        ArrayList<Integer> List1 = new ArrayList<>();

        // We are Adding elements in these two 1-D ArrayList
        List0.add(1);
        List0.add(2);
        List1.add(3);
        List1.add(4);

        // We are Adding these two 1-d ArrayList into main ArrayList
        mainList.add(List0);
        mainList.add(List1);

        // Now print the main ArrayList
        System.out.println(mainList); // -> [[1, 2], [3, 4]]

        // Now we will Learn the Concept of Multi-Dimensional ArrayList
        ArrayList<ArrayList<Integer>> MainList = new ArrayList<>();
        ArrayList<Integer> ListA = new ArrayList<>();
        ArrayList<Integer> ListB = new ArrayList<>();
        ArrayList<Integer> ListC = new ArrayList<>();

        for (int i = 0; i < 5; i++)  ListA.add((i+1));
        for (int i = 0; i < 5; i++)  ListB.add((i+1)*2);
        for (int i = 0; i < 5; i++)  ListC.add((i+1)*3);

        MainList.add(ListA);
        MainList.add(ListB);
        MainList.add(ListC);

        System.out.println(MainList); // -> [[1, 2, 3, 4, 5], [2, 4, 6, 8, 10], [3, 6, 9, 12, 15]]
    }
}