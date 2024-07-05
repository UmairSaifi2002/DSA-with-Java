import java.util.*;

public class Reverse_of_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int Original_num = num;

        // Now we gonna reverse a given number
        int reverse_num = 0;
        while (num>0) {
            int small_num = num%10;
            // System.out.println(small_num);
            num = num / 10;
            // System.out.println(num);
            reverse_num = reverse_num*10 + small_num;
            // System.out.println(reverse_num);
        }
        System.out.println("The Original Number -> "+Original_num+"\nReverse Number -> "+reverse_num);
    }
}