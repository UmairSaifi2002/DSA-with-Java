import java.util.*;

public class seventh_Area_of_a_Circle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Area of a Circle.
        double radius = sc.nextDouble();
        // Here is the Value of the PI.
        double pi = Math.PI;
        double area = (pi * radius * radius) ;
        System.out.println("IF the Radius is : " + radius + " Then Area of a Circle is -> " + area );
    }
}
