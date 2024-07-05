import java.util.*;

public class Keep_entering_a_number_till_user_enters_a_multiple_of_10{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num;

        // Using while loop
        // while(1<2){
        //     num = scan.nextInt();
        //     if(num % 10 == 0){ 
        //         System.out.println("We are out of the loop.");
        //         break;
        //     }
        // }

        // using Do-while loop
        do{
            num = scan.nextInt();
        }while(num % 10 != 0);
    }
}