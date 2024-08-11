public class Find_Permutation {

    public static void permutation(String str, String newStr) {
        // Base Case
        if (str.length() == 0) {
            System.err.print(newStr+" ");
            return;
        }
        
        // Recursion
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            // "abcde" => "ab" + "de" = "abde"
            String Newstr = str.substring(0, i) + str.substring(i+1);
            // System.out.println(Newstr);
            permutation(Newstr, newStr+curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        // permutation(str, "", 0);
        permutation(str, "");
    }
}