import java.util.*;

public class Binary_to_Decimal{
    public static int To_Decimal(int num){
        int pow = 0;
        int last_digit;
        int decimal_number = 0;
        while(num > 0){
            last_digit = num % 10;
            decimal_number = (int)(decimal_number+(last_digit * Math.pow(2, pow)));
            pow++;
            num = num/10;
        }
        return decimal_number;
    }
    @SuppressWarnings("resource")
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int bin = scan.nextInt();
        // int number = To_Decimal(binary);
        System.out.println("Your Decimal Number : "+To_Decimal(bin));
    }
}