import java.util.*;
public class Palindrome {

    public static boolean isPalindrome(LinkedList<Character> l) {
        Stack<Character> s = new Stack<>();
        int mid  = l.size() / 2, count = 0;
        
        if ((l.size() % 2) != 0) {
            while (count <= mid) {
                s.push(l.get(count));
                count++;
            }
            s.pop();
            // count++;
        }
        else {
            while (count < mid) {
                s.push(l.get(count));
                count++;
            }
        }
        while (!s.isEmpty()) {
            if (s.peek() != l.get(count)) {
                // System.out.println(s.peek()+", "+l.get(count));
                return false;
            }
            s.pop();
            count++;
        }
        return true;
    }

    public static void main(String[] args) {
        // Question 1 :
        // Palindrome Linked List
        // We have a singly linked list of characters, write a function that returns true if the given list is a
        // palindrome, else false
        LinkedList<Character> l = new LinkedList<>();
        l.addFirst('A');
        l.addLast('B');
        l.addLast('C');
        l.addLast('C');
        l.addLast('B');
        l.addLast('A');
        LinkedList<Character> ll = new LinkedList<>();
        ll.addFirst('A');
        ll.addLast('B');
        ll.addLast('C');
        ll.addLast('B');
        ll.addLast('A');
        // System.out.println(l);
        // System.out.println(l.size());
        System.out.println(isPalindrome(l));
        System.out.println(isPalindrome(ll));

    }
}
