public class Currency_Exchange_for_an_Amount05 {
    public static void main(String[] args) {
        int coins[] = {1, 2, 5, 10, 20, 50, 100, 500, 2000};
        int amount = 121;
        int notes = 0;
        for (int i = coins.length-1; i >= 0; i--) {
            if (amount >= coins[i]) {
                while (amount >= coins[i]) {
                    notes++;
                    amount -= coins[i];
                    System.out.print(coins[i]+" + ");
                }
            }
        }
        System.out.println(0);
        System.out.println("Number of Notes Required -> "+notes);
    }
}
