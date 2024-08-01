// import java.util.*;

public class Clear_Last_ith_Bits {

    public static int ClearLastBits (int num, int pos) {
        int result = num & (-1 << pos);
        // here we use -1 beacuse it have all the bits are 1
        // You know ~0 == -1
        // because ~0 = (11111...) in binary form
        // -1 = (111111...) in binary form
        // we can use ~0 instead of -1
        return result;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        int num = 15;
        int pos = 2;
        int result = ClearLastBits(num, pos);
        System.out.println(num+" after clearing the last "+pos+" bits it become -> "+result);
    }
}