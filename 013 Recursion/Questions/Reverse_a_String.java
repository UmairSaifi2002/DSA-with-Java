public class Reverse_a_String {

    public static StringBuilder Reverse(String str, int n, StringBuilder newStr) {
        // Base case
        if (n < 0) {
            return newStr;
        }
        // kaam
        newStr.append(str.charAt(n));
        // recursive call
        return Reverse(str, n-1, newStr);
    }

    public static void main(String[] args) {
        // Reverse a String
        String str = "abcd";
        System.out.println(Reverse(str, str.length()-1, new StringBuilder()));
    }
}