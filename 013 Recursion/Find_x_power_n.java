public class Find_x_power_n {

    public static int FindPow(int num, int pow) {
        // Time complexity O(n)
        // Base Case
        if (pow == 0) {
            return 1;
        }
        // Recursive call
        return num * FindPow(num, pow-1);
    }

    // Optimized approach using Recursion
    public static int FindPower(int num, int pow) {
        // Base Case
        if (pow == 0) {
            return 1;
        }
        // Some conditional Statement
        if ((pow & 1) == 0) { // Pow is Even.
            return FindPower(num, pow/2) * FindPower(num, pow/2);
        }
        else { // Pow is Odd.
            return num * FindPower(num, pow/2) * FindPower(num, pow/2);
        }
    }

    public static void main(String[] args) {
        int num = 2;
        int pow = 10;
        int result = FindPow(num, pow);
        System.out.println(result); 
        int resultone = FindPower(num, pow);
        System.out.println(resultone);
    }
}