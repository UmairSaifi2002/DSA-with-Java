import java.util.*;
import java.util.LinkedList;

public class Basics_of_Deque01 {
    public static void main(String[] args) {
        Deque<Integer> deque = new LinkedList<>();
        // Deque have its 6 unique functions
        // 1, addFirst()       2, addLast() 
        // 3, removeFirst()    4, removeLast()
        // 5, getFirst()       6, getLast()

        deque.addFirst(2);
        deque.addFirst(1);
        deque.addLast(3);
        deque.addLast(4);
        deque.addLast(5);
        System.out.println(deque);

        deque.removeFirst();
        System.out.println(deque);
        deque.removeLast();
        System.out.println(deque);
        
        System.out.println("First element :- "+deque.getFirst());
        System.out.println("First element :- "+deque.getLast());
    }
}
