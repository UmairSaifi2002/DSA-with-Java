public class Move_all_x_to_the_end_of_the_string {

    public static StringBuilder MoveToEnd(String str, int indx, int in, StringBuilder newStr) {
        // Base case
        if (indx == str.length()) {
            return newStr;
        }
        // kaam
        if (str.charAt(indx) == 'x') {
            newStr.append(str.charAt(indx++));
            return MoveToEnd(str, indx, in, newStr);
        }
        newStr.insert(in++, str.charAt(indx++));
        return MoveToEnd(str, indx, in, newStr);
    }

    public static void main(String[] args) {
        // Move all x to the end of the string
        String str = "axbcxxd";
        System.err.println(MoveToEnd(str, 0, 0, new StringBuilder()));
    }
}