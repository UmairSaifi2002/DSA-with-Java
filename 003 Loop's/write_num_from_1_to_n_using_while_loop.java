import java.util.*;

public class write_num_from_1_to_n_using_while_loop{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int n = 0;
        while (n<num) {
            System.out.print(n+1+"\t");
            n++;
        }
    }
}