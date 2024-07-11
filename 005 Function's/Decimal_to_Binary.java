import java.util.*;

public class Decimal_to_Binary{
    public static int To_Binary(int num){
        int pow = 0;
        int binary_num = 0;
        while(num > 0){
            int rem = num%2;
            binary_num = binary_num + (rem*(int)Math.pow(10,pow));
            pow++;
            num = num / 2;
        }
        return binary_num;
    }
    public static void main(String args[]){
        @SuppressWarnings("resource")
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int Number = scan.nextInt();
        int result = To_Binary(Number);
        System.out.println(result);
    }
}