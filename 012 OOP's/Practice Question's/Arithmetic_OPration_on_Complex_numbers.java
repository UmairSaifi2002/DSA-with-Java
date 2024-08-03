import java.util.*;

public class Arithmetic_OPration_on_Complex_numbers {

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        // two complex numbers
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first complex number");
        System.out.print("Enter the real part : ");
        int x1 = scan.nextInt();
        System.out.print("Enter the imaginary part : ");
        int y1 = scan.nextInt();

        System.out.println("Enter your secoond complex number");
        System.out.print("Enter the real part : ");
        int x2 = scan.nextInt();
        System.out.print("Enter the imaginary part : ");
        int y2 = scan.nextInt();

        Complex comp = new Complex();
        int arr[] = comp.Sum(x1, y1, x2, y2);
        System.out.println("The sum of ("+x1+" + "+y1+"i) + ("+x2+" + "+y2+"i) is -> "+"("+arr[0]+" + "+arr[1]+"i)");

        int arr1[] = comp.diff(x1, y1, x2, y2);
        System.out.println("The sum of ("+x1+" + "+y1+"i) - ("+x2+" + "+y2+"i) is -> "+"("+arr1[0]+" + "+arr1[1]+"i)");

        int arr2[] = comp.multiply(x1, y1, x2, y2);
        System.out.println("The sum of ("+x1+" + "+y1+"i) * ("+x2+" + "+y2+"i) is -> "+"("+arr2[0]+" + "+arr2[1]+"i)");
    }
}

class Complex {
    int x1;
    int x2;

    int y1;
    int y2;

    int[] Sum(int x1, int y1, int x2, int y2) {
        int real = x1+x2;
        int img = y1+y2;
        int arr[] = {real, img};
        return arr;
    }

    int[] diff(int x1, int y1, int x2, int y2) {
        int real = x1 - x2;
        int img = y1 - y2;
        int arr[] = {real, img};
        return arr;
    }

    int[] multiply(int x1, int y1, int x2, int y2) {
        int real = ((x1*x2) - (y1*y2));
        int img = ((x1*x2) + (y1*y2));
        int arr[] = {real, img};
        return arr;
    }
}
