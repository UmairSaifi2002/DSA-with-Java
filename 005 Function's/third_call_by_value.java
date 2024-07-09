// import java.util.*;

public class third_call_by_value{
    public static void callByValue(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("The value of a : "+a+" & b : "+b+" in a swapping function");
    }
    // Java does not support call by reference because it always passes arguments to methods by value. 
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);
        int a = 2;
        int b = 3;
        System.out.println("The value of a : "+a+" & b : "+b+" before the swapping function");
        callByValue(a, b);
        System.out.println("The value of a : "+a+" & b : "+b+" after the swapping function");
    }
}