public class AddOneUsingBitwise {

    public static int addOne(int n) {
        // int mask = 1;
        // while ((n & mask) != 0) {
        //     n = n ^ mask;
        //     System.out.println(n);
        //     mask <<= 1;
        //     // System.out.println(mask);
        // }
        // n = n ^ mask;
        // System.out.println(n);
        n = -(~n) ;
        return n;
    }

    public static void main(String[] args) {
        int number = 5;
        int result = addOne(number);
        System.out.println(number + " + 1 = " + result);
    }
}
