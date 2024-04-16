import java.util.*;

public class Third_total_cost {
    public static void main(String[] args) {
        /*
         Question 3: Enter cost of 3 items from the user (using float data type) 
         a pencil, a pen and an eraser. 
         You have to output the total cost of the items back to the user as their bill.
         Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the price of pencil");
        double pencil = sc.nextDouble();
        System.out.println("Enter the price of pen");
        double pen = sc.nextDouble();
        System.out.println("Enter the price of eraser");
        double eraser = sc.nextDouble();
        double total = (pencil+pen+eraser);
        double gst = ((pencil+pen+eraser)*18)/100;
        double bill = (total + gst);
        System.out.println("Your Total amount is -> " + total+"\n18% GST is -> "+gst+"\nYour bill is -> "+bill);
    }
}
