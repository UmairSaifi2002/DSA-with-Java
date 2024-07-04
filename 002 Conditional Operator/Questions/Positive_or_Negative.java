import java.util.*;

public class Positive_or_Negative{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        // identify the number is positive or negative
        // using ternary operator
        String type = (num>0)?"Positive":"Negative";
        System.out.println("Your number -> "+num+"\nType -> "+type);
    }
}