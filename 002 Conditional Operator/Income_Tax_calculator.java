import java.util.*;

public class Income_Tax_calculator {
    public static void main(String[] args) {
        /*
            income < 5L -> 0% tax
            income between 5L <= 10L -> 20% tax
            income > 10L -> 30
        */
        Scanner sc = new Scanner(System.in);
        long income = sc.nextInt();
        if(income < 500000) {   
            System.out.println("Your income Tax is -> " + 0);
        }
        else if(income >= 500000 && income < 1000000) {
            System.out.println("Your income Tax is -> " + ((income*20)/100)  );
        }
        else {
            System.out.println("Your income Tax is -> " + ((income*30)/100)  );
        }
    }   
}
