// import java.util.*;

public class String_Comparision {

    public static String substring(String str, int si, int ei) {
        String result = "";
        for (int i = si; i < ei; i++) {
            result += str.charAt(i);
        }
        return result;
    }

    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");

        // '==' checks that a two string are equal at object level.
        // means that both s1 and s2 are pointing to the same object. 
        if (s1 == s2) System.err.println("s1 == s2");
        else System.out.println("s1 != s2");

        if (s1 == s3) System.out.println("s1 == s3");
        else System.out.println("s1 != s3");

        // if we want to check that two strings values only
        // then the we use  .equals()   syntax -> 'StringOne.equals(StringTwo)'.

        if (s1.equals(s3)) System.out.println("s1 == s3");
        else System.out.println("s1 != s3");


        // SUB - String of a String
        String str = "Hello World! I am Umair.";
        // manually
        System.out.println(substring(str, 3, 11));
        // by using the inbuilt function 
        System.out.println(str.substring(3,11));
    }
}