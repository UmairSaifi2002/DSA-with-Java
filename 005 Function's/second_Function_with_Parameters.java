import java.util.*;

public class second_Function_with_Parameters{
    public static int calculateSum(int a, int b){
        return (a+b);
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter First Number -> ");
        int first = scan.nextInt();
        System.out.print("Enter Second Number -> ");
        int second = scan.nextInt();
        int sum = calculateSum(first, second);
        System.out.println("The sum of "+first+" & "+second+" is -> "+sum);
    }
}