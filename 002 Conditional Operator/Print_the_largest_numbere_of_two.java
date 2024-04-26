import java.util.*;

public class Print_the_largest_numbere_of_two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double first = sc.nextDouble();
        double second = sc.nextDouble();
        if(first > second){
            System.out.println(first+" > "+second);
        }
        else {
            System.out.println(first+" < "+second);
        }
    }
}
