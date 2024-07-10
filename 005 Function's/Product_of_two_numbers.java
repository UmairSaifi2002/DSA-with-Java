import java.util.*;

public class Product_of_two_numbers{
    public static int product(int a, int b){
        return a*b;
    }
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the first number -> ");
        int a = scan.nextInt();
        System.out.print("Enter the second number -> ");
        int b = scan.nextInt();
        int result = product(a, b);
        System.out.println("The Product of "+a+" & "+b+" is -> "+result);
    }
}