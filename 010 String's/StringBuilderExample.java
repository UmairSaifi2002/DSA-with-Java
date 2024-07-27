public class StringBuilderExample {
    public static void main(String[] args) {
        // StringBuilder in Java is a mutable sequence of characters. Unlike String, which is immutable,
        // StringBuilder can be modified after it is created, which makes it more efficient for certain tasks, 
        // particularly when you need to make many modifications to a string,
        // such as appending, inserting, or deleting characters. 
        // Here's an overview of the StringBuilder class in Java:

        StringBuilder sb = new StringBuilder("Welcome");

        // Append
        sb.append(" to Java!");
        System.out.println(sb); // Output: Welcome to Java!

        // Insert
        sb.insert(7, "new ");
        System.out.println(sb); // Output: Welcome new to Java!

        // Delete
        sb.delete(7, 11);
        System.out.println(sb); // Output: Welcome to Java!

        // Replace
        sb.replace(11, 15, "the Java World");
        System.out.println(sb); // Output: Welcome to the Java World!

        // Reverse
        sb.reverse();
        System.out.println(sb); // Output: !dlroW avaJ eht ot emocleW

        // Convert to String
        String finalString = sb.toString();
        System.out.println(finalString); // Output: !dlroW avaJ eht ot emocleW

        // Performance Considerations
        // Using StringBuilder is generally more efficient than using String concatenation, 
        // especially in loops, because StringBuilder can grow its internal character array 
        // dynamically without creating new string objects for each modification. 
        // Here’s an example comparing String concatenation and StringBuilder:

        // Using String concatenation in a loop (less efficient)
        String str = "";
        for (int i = 0; i < 10; i++) {
            str += i;
        }
        System.out.println(str);

        // Using StringBuilder (more efficient)
        StringBuilder sbi = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sbi.append(i);
        }
        String result = sbi.toString();
        System.out.println(result);
    }
}
