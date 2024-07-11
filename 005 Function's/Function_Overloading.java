// import java.util.*;

public class Function_Overloading{
    // Function Overloading with Parameter
    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a, int b, int c){
        return a+b+c;
    }
    public static float sum(float a, float b){
        return a+b;
    }
    public static long sum(long a, long b){
        return a+b;
    }
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);
        sum(1,2);
        sum(1,2,3);
        float a = 1;
        float b = 2;
        long aa = 1;
        long bb = 2;
        sum(a,b);
        sum(aa,bb);
    }
}