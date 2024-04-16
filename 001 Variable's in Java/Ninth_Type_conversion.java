import java.util.*;

public class Ninth_Type_conversion {
    public static void main(String[] args) {

        // Type Conversion is Explicit conversions

        Scanner sc = new Scanner(System.in);
        float a = 25.12f;
        // int b = a; // it through error due to type incompatibility
        // we can convert float to int using type conversion
        // let see how it works
        int b = (int)a;
        System.out.println("The float number -> "+a+" \nConverted into an Integer -> "+b);
    }
}
