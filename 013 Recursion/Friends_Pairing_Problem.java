public class Friends_Pairing_Problem {

    public static int Pairing(int n) {
        // Base case
        if (n == 1 || n == 2) {
            return n;
        }
        // kaam
        // for single
        int single = Pairing(n-1);
        int duale = (n-1)*Pairing(n-2);
        int total = single + duale;
        return total;
    }

    public static void main(String[] args) {
        // Problem Statement
        // Given n friends, each one can remain single or can be paired up with some other friend.
        // Each friend can be paired only once. Find out the total number of ways in which friends can
        // remain single or can be paired up.
        int n = 4;
        int ways = Pairing(n);
        System.out.println(ways);
    }
}