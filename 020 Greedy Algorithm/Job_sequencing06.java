import java.util.*;
public class Job_sequencing06 {
    public static void main(String[] args) {
        // Define a 2D array representing jobs. Each job has 3 values:
        // jobs[i][0] -> Job ID
        // jobs[i][1] -> Deadline (in terms of time slots)
        // jobs[i][2] -> Profit (the profit for completing the job)
        int jobs[][] = {{1,4,20},{2,1,10},{3,1,40},{4,1,30}};

        // Sort the jobs based on the profit in descending order
        // We're using Comparator with Arrays.sort() to sort by the 3rd element (profit)
        Arrays.sort(jobs, Comparator.comparingDouble(o -> o[2]));

        // This will hold the total time (or total number of jobs that can be scheduled)
        int totalTime = 0;

        // temp is used to calculate the character (e.g., A, B, C) corresponding to the job ID
        // 'A' starts at ASCII value 65, so we set temp to 64 (we'll add job ID to it later)
        int temp = 64;

        // Traverse the jobs array in reverse order (starting from the job with the highest profit)
        for (int i = jobs.length-1; i >= 0; i--) {
            // Check if the total time is less than the job's deadline
            // This condition ensures we can schedule this job within its deadline
            if (totalTime < jobs[i][1]) {
                // If we can schedule the job, increment the total time by the job's deadline
                totalTime += jobs[i][1];

                // Convert the job ID to a character (A, B, C, ...) and print it
                // (char)(temp + jobs[i][0]) -> Adds the job ID to 'A' (ASCII 65) to get the corresponding letter
                System.out.print((char)(temp + jobs[i][0]) + ",");
            }
        }
    }
}
