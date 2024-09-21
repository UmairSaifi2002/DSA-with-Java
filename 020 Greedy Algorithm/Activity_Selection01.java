import java.util.*;

public class Activity_Selection01 {

    // Function to select activities when the 'end' array is already sorted
    public static void ActivitySelection(int start[], int end[]) {
        int maxAct = 0;  // To keep track of the maximum number of activities
        ArrayList<Integer> ans = new ArrayList<>();  // To store the indices of selected activities
        
        // Always select the first activity since it finishes first
        maxAct = 1;  // We selected the first activity, so count is 1
        ans.add(0);  // Add the index of the first activity to the answer list
        int lastEnd = end[0];  // Keep track of when the last selected activity ended
        
        // Now, check the remaining activities
        for (int i = 1; i < end.length; i++) {  // Start from the second activity (i=1)
            // If the start time of the current activity is after or when the last activity ends
            if (start[i] >= lastEnd) {
                maxAct++;  // Increment the number of selected activities
                ans.add(i);  // Add this activity's index to the answer list
                lastEnd = end[i];  // Update the lastEnd to the end time of the current activity
            }
        }
        
        // Print the total number of activities selected
        System.out.println("Max activities = " + maxAct);
        
        // Print the indices of the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");  // Print activity numbers (like A0, A2, etc.)
        }
    }

    // Function to select activities when the 'end' array is not sorted
    public static void ActivitySelectionUnSorted(int start[], int end[]){
        // Create a 2D array to hold each activity's index, start, and end times
        int activities[][] = new int[start.length][3];
        for (int i = 0; i < activities.length; i++) {
            activities[i][0] = i;  // Store the index of the activity (e.g., 0, 1, 2, ...)
            activities[i][1] = start[i];  // Store the start time
            activities[i][2] = end[i];  // Store the end time
        }
        
        // Sort activities based on their end times using Arrays.sort() and a lambda function
        Arrays.sort(activities, Comparator.comparingDouble(o -> o[2]));

        // Now that activities are sorted by end time, select activities as before
        int maxAct = 0;  // To count the maximum number of activities
        ArrayList<Integer> ans = new ArrayList<>();  // To store the indices of selected activities
        
        // Always select the first activity (after sorting)
        maxAct = 1;  // We selected the first activity, so count is 1
        ans.add(activities[0][0]);  // Add the index of the first selected activity
        int lastEnd = activities[0][2];  // Keep track of when the last selected activity ended
        
        // Check the remaining activities
        for (int i = 1; i < end.length; i++) {
            // If the start time of the current activity is after the end of the last selected activity
            if (activities[i][1] >= lastEnd) {
                maxAct++;  // Increment the count of selected activities
                ans.add(activities[i][0]);  // Add this activity's index to the answer list
                lastEnd = activities[i][2];  // Update the lastEnd to the end time of the current activity
            }
        }
        
        // Print the total number of activities selected
        System.out.println("Max activities = " + maxAct);
        
        // Print the indices of the selected activities
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");  // Print activity numbers (like A0, A3, etc.)
        }
    }

    public static void main(String[] args) {
        // Input arrays representing the start and end times of activities
        int start[] = {1, 3, 0, 5, 8, 5};
        int end[] = {2, 4, 6, 7, 9, 9};
        
        // Call the function that assumes the activities are sorted by end times
        ActivitySelection(start, end);
        
        System.out.println();
        
        // Call the function that works with unsorted end times
        ActivitySelectionUnSorted(start, end);
    }
}
