import java.util.*;

public class print_table{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}