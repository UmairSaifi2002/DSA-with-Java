public class Find_Subsets {

    public static void FindSubsets(String str, String newStr, int index){
        // Base Case
        if (index == str.length()) {
            if (newStr.length() == 0) {
                System.err.print("null"+" ");
            }
            else {
                System.out.print(newStr+" ");
            }
            return;
        }
        // Recursion
        // Yes Choice
        FindSubsets(str, newStr+str.charAt(index), index+1);
        // No Choice
        FindSubsets(str, newStr, index+1);
    }

    public static void main(String[] args) {
        String str = "abc";
        // total subsets for any string is 2^n 
        // where n = Str.length()
        FindSubsets(str, "", 0);
    }
}