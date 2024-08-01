public class Convert_UpperCase_to_LowerCase {

    public static void main(String[] args) {
        for (char i = 'A'; i < 'Z'; i++) {
            System.out.print(i);
            // Converting uppercase to lowercase
            System.out.print((char)(i | ' '));
        }
    }
}