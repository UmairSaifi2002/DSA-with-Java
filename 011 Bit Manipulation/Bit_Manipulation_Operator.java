// import java.util.*;

public class Bit_Manipulation_Operator {

    public static int AndOperator(int a, int b) {
        int result = a&b;
        return result;
    }

    public static int ORoperator(int a, int b) {
        int result = a|b;
        return result;
    }

    public static int XORoperator(int a, int b) {
        int result = a ^ b;
        return result;
    }

    public static int OnesCompliment(int a) {
        int result = ~a;
        return result;
    }

    public static int LeftShift(int a, int b) {
        int result = a << b;
        return result;
    }

    public static int RightShift(int a, int b) {
        int result = a >> b;
        return result;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        // int first = scan.nextInt();
        // int second = scan.nextInt();
        int first = 5;
        int second = 6;

        // And Operator
        int And = AndOperator(first, second);
        System.out.println(first+" & "+second+" -> "+And);

        // OR operator
        int OR = ORoperator(first, second);
        System.out.println(first+" | "+second+" -> "+OR);

        // XOR operator
        int XOR = XORoperator(first, second);
        System.out.println(first+" ^ "+second+" -> "+XOR);

        // 1's Compliment
        int OnesComp1 = OnesCompliment(first);
        int OnesComp2 = OnesCompliment(second);
        System.out.println("~"+first+" -> "+OnesComp1);
        System.out.println("~"+second+" -> "+OnesComp2);

        int a = 4;
        int b = 2;

        // Left shift
        int leftshift = LeftShift(a, b);
        System.out.println(a+" << "+b+" -> "+leftshift); 

        // Right Shift
        int rightshift = RightShift(a, b);
        System.out.println(a+" >> "+b+" -> "+rightshift);
    }
}