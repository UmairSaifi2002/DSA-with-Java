public class Tower_of_Hanoi {

    public static void TowerOfHanoi(int n, String Src, String Helper, String Dest) {
        // Base case
        if (n == 1) {
            System.out.println("Transfer Disk "+n+" from "+Src+" to "+Dest);
            return;
        }
        // Recursive call
        TowerOfHanoi(n-1, Src, Dest, Helper);
        System.out.println("Transfer Disk "+n+" from "+Src+" to "+Dest);
        TowerOfHanoi(n-1, Helper, Src, Dest);
    }

    public static void main(String[] args) {
        // Tower Hanoi
        int n = 3;
        TowerOfHanoi(n, "S", "H", "D");
        System.out.println();
        TowerOfHanoi(2, "S", "H", "D");
        System.out.println();
        TowerOfHanoi(1, "S", "H", "D");
    }
}