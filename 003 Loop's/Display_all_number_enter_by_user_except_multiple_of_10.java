import java.util.*;

public class Display_all_number_enter_by_user_except_multiple_of_10{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int num;
        do {
            System.out.println("Enter the number.");
            num = scan.nextInt();
            if (num % 10 == 0) {
                continue;
            }
            System.out.println("You entered -> "+num);
        } while (true);
    }
}