import java.util.*;

public class Ternary_operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Let's Learn about Ternary Operator.
        // Syntax for Ternary operator
        // Variable = condition ? condition1 : condition2
        
        // Ternary operator
        int larger_num = (5>3)?5:3; // that's how we select the large number among two given numbers
        String type = (5%2 == 0)?"even":"odd"; // that's how we detect that the number is even or odd
        System.out.println(larger_num);
        System.out.println(type);

        // another example
        long num = sc.nextLong();
        String ans = (num>33)? "PASS" : "FAIL";
        System.out.println("You "+ans+" in your exams");
    }
}
