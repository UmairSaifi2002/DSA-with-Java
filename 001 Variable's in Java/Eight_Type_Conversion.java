import java.util.*;

public class Eight_Type_Conversion{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Type conversions happen when
        // 1, Type Compatible
        // 2, Destination type > Source type

        // byte -> short -> int -> float -> long -> double

        // now we convert int to float
        int a = 2;
        float b = a;
        System.out.println(b);
        // but float is not convert into int ( implicitly )

        float x = sc.nextInt();
        System.out.println(x);
    }
}