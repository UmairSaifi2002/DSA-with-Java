import java.util.*;

public class You_have_fever_or_not {
    public static void main(String[] args){
        double body_temp = 103.4;
        String result = (body_temp > 100) ? "You have Fever!" : "You do not have Fever!";
        System.out.println(result);
    }
}