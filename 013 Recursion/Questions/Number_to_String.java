public class Number_to_String {

    public static StringBuilder NumToStr(int num, StringBuilder str) {
        // Base Case: If num is zero and str is empty, just return "zero"
        if (num == 0 && str.length() == 0) {
            str.append("zero");
            return str;
        }
        // Base Case
        if (num == 0) {
            return str;
        }
        // kaam
        int CurrentNum = num % 10;
        num = num / 10;
        if (CurrentNum == 0) {
            str.insert(0,"zero ");
        }
        else if (CurrentNum == 1) {
            str.insert(0, "one ");
        }
        else if (CurrentNum == 2) {
            str.insert(0, "two ");
        }
        else if (CurrentNum == 3) {
            str.insert(0, "three ");
        }
        else if (CurrentNum == 4) {
            str.insert(0, "four ");
        }
        else if (CurrentNum == 5) {
            str.insert(0, "five ");
        }
        else if (CurrentNum == 6) {
            str.insert(0, "six ");
        }
        else if (CurrentNum == 7) {
            str.insert(0, "seven ");
        }
        else if (CurrentNum == 8) {
            str.insert(0, "eight ");
        }
        else {
            str.insert(0, "nine ");
        }
        // recursive call
        return NumToStr(num, str);
    }

    public static void main(String[] args) {
        // 1947 -> "one nine four seven."
        int number = 2006;
        StringBuilder str = new StringBuilder();
        System.out.println(NumToStr(number, str));
    }
}