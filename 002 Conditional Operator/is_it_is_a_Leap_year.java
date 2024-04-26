import java.util.*;

public class is_it_is_a_Leap_year {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        if(year%4 == 0){
            if (year%100 == 0) {
                if (year%400 == 0) {
                    System.out.println("Yes "+year+" is a Leap year.");
                } else {
                    System.out.println("NO "+year+" is not a Leap year.");
                }
            } else {
                System.out.println("Yes "+year+" is a Leap year.");
            }
        } else {
            System.out.println("NO "+year+" is not a Leap year.");
        }
    }
}
