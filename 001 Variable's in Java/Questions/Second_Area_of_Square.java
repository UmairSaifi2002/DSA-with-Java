import java.util.*;

public class Second_Area_of_Square {
    public static void main(String[] args) {
        /*
         Question 2: In a program, input the side of a square.
         You have to output the area of the square.
        */
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the side of a Square");
        double side = sc.nextDouble();
        System.out.println("The Area of the Square -> "+(side*side));
    }
}
