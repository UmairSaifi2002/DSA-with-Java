import java.util.*;

public class Print_Reverse_of_an_ArrayList {

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();
        List.add(1);
        List.add(2);
        List.add(3);
        List.add(4);
        List.add(5);
        List.add(6);

        int size = List.size();

        for (int i = size-1; i >= 0; i--) {
            System.out.print(List.get(i)+" ");
        }
    }
}