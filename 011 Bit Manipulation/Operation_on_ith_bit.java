import java.util.*;

public class Operation_on_ith_bit {

    public static int GetithBit(int num, int pos) {
        int result = num & (1 << pos);
        if (result > 0) return 1;
        return 0;
    }

    public static int SetithBit (int num, int pos) {
        // Set ith Bit means convert the bit into 1
        int result = num | (1 << pos);
        return result;
    }

    public static int ClearithBit (int num, int pos) {
        // Clear ith Bit means convert the bit into 0
        int result = num & (~(1 << pos));
        return result;
    }

    public static int UpdateithBit (int num, int pos, int newBit) {
        int result;

        // Approach 1
        // if (newBit == 1) result = SetithBit(num, pos);
        // else result = ClearithBit(num, pos);

        // Approach 2
        num = ClearithBit(num, pos); // here we clear the position where you want to update the bit
        result = num | (newBit << pos); // here we are performing OR operation by left shift the newBit by the position given by the user
        return result;
    }

    @SuppressWarnings("resource")
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int position = scan.nextInt();

        // Calling the GetithBit function
        int Get_ith_Bit = GetithBit(number, position);
        System.out.println("Bit at a position "+position+" is -> "+Get_ith_Bit);

        // Calling the SetithBit function
        int Set_ith_Bit = SetithBit(number, position);
        System.out.println(number+" after setting a "+position+"th Bit -> "+Set_ith_Bit);

        // Calling the ClearithBit function
        int Clear_ith_Bit = ClearithBit(number, position);
        System.out.println(number+" after Clearing a "+position+"th Bit -> "+Clear_ith_Bit);

        // Calling UpdateithBit function
        int Update_ith_Bit_1 = UpdateithBit(number, position, 1);
        System.out.println(Update_ith_Bit_1);
        int Update_ith_Bit_0 = UpdateithBit(number, position, 0);
        System.out.println(Update_ith_Bit_0);
    }
}