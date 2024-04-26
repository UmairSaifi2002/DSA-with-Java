import java.util.*;

public class Find_largest_of_3_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int first_num = sc.nextInt();
        int second_num = sc.nextInt();
        int third_num = sc.nextInt();
        if (first_num > second_num) {
            if (first_num > third_num) {
                System.out.println("The Largest Number is "+first_num);
            } else {
                System.out.println("The Largest Number is "+ third_num);
            }
        } else {
            if (second_num > third_num) {
                System.out.println("The Largest Number is "+ second_num);
            } else {
                System.out.println("The Largest Number is "+third_num);
            }
        }
    }
}
