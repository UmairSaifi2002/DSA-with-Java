public class Find_Permutation {
    public static void permutation(String str, String newStr) {
        // Base Case: when the original string is empty, print the current permutation
        if (str.length() == 0) {
            System.out.print(newStr + " ");
            return;
        }

        // Recursive Case: for each character in the string
        for (int i = 0; i < str.length(); i++) {
            // Select the current character
            char curr = str.charAt(i);

            // Remove the current character from the string
            // Example: "abcde" => "ab" + "de" = "abde" (excluding the current character 'c')
            String remainingStr = str.substring(0, i) + str.substring(i + 1);

            // Recursively generate permutations for the remaining string
            // and append the current character to the new string
            permutation(remainingStr, newStr + curr);
        }
    }

    public static void main(String[] args) {
        String str = "abc";
        // Start generating permutations from an empty string
        permutation(str, "");
    }
}


/*
 This code generates all permutations of the input string "abc". Here's a step-by-step explanation:

1. The permutation method takes two parameters: the original string str and the current permutation newStr.
2. The base case is when str is empty, at which point the current permutation newStr is printed.
3. The recursive case iterates through each character in str.
4. For each character, it:
    - Selects the current character curr.
    - Removes curr from str to form a new string remainingStr.
    - Recursively generates permutations for remainingStr and appends curr to newStr.
5. In the main method, the process starts with an empty permutation ("").

The output will be all permutations of "abc":


abc acb bac bca cab cba


Note that the number of permutations is n!, where n is the length of the string (3 in this case), resulting in 3! = 6 permutations.
*/