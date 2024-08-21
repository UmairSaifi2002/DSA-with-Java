public class Phone_Keypad_Combination {

    public static void combination(String f, String s, int xindex, int yindex) {
        // base case
        if (xindex == f.length()) {
           return; 
        }
        //
        for (int i = 0; i < f.length(); i++) {
            System.out.println(f.charAt(xindex)+s.charAt(yindex));
            combination(f, s, xindex+1, i);
        }
    }

    public static void main(String[] args) {
        String arr[] = {"abc","def","ghi"};
        combination("abc", "def", 0, 0);
    }
}