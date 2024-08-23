import java.util.ArrayList;

public class Pair_Sum_SortedRotated_ArrayList {

    // Finding pivot element in the rotated sorted array
    public static Integer pivotElement(ArrayList<Integer> List) {
        for (int i = 0; i < List.size() - 1; i++) {
            if (List.get(i) > List.get(i + 1)) {
                return i;
            }
        }
        return -1;
    }

    // Optimized approach to find the pair with a given sum
    public static boolean OptimizedApproach(ArrayList<Integer> List, int target) {
        int pivot = pivotElement(List); // Get the pivot index
        int start = (pivot + 1) % List.size(); // Start after pivot
        int end = pivot; // End at pivot

        while (start != end) {
            int sum = List.get(start) + List.get(end);

            if (sum == target) {
                return true;
            }

            // Move start forward (circularly) if the sum is less than the target
            if (sum < target) {
                start = (start + 1) % List.size();
            }
            // Move end backward (circularly) if the sum is greater than the target
            else {
                end = (end - 1 + List.size()) % List.size();
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> List = new ArrayList<>();

        // Adding elements to the ArrayList
        List.add(11);
        List.add(15);
        List.add(6);
        List.add(8);
        List.add(9);
        List.add(10);

        int target = 16;

        // Check if a pair with the given sum exists
        boolean result = OptimizedApproach(List, target);
        System.out.println("Pair with sum " + target + " exists: " + result);
    }
}
