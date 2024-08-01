public class Swapping_two_number {

    public static int[] SwapArithmetically (int a, int b) {
        a = a + b;
        b = a - b;
        a = a - b;
        int arr[] = {a,b};
        return arr;
    }

    public static int[] SwapXOR (int a, int b) {
        a = a^b;
        b = a^b;
        a = a^b;
        int arr[] = {a,b};
        return arr;
    }

    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        System.out.println(a+", "+b);
        int ans1[] = SwapArithmetically(a, b);
        int ans2[] = SwapXOR(a, b);
        System.out.println(ans1[0]+", "+ans1[1]);
        System.out.println(ans2[0]+", "+ans2[1]);
    }
}