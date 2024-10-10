import java.util.Comparator;
import java.util.PriorityQueue;

public class Priority_Queue_with_Objects02 {
    static class Student implements Comparable<Student>{ // Student has a name and rank
        String name;
        int rank;

        Student(String name, int rank){
            this.name = name; // Student's name
            this.rank = rank; // Student's rank
        }

        @Override
        public int compareTo(Student S2) { // Comparing ranks to order students
            return this.rank - S2.rank; // Smaller ranks come first
            // here return pass only three output 
            // +ve if it return +ve value so current context rank is greater than object S2 rank
            //     so object S2 rank add before the current context rank
            // -ve if it return -ve value so current context rank is less than object S2 rank
            //     so current context rank add before the object S2
            // 0   if it return +ve value so current context rank is equal to object S2 rank
            //     so no matters who's rank come before
            // it gives ascending order.

            // so if we change this (return this.rank - S2.rank) to this (return S2.rank - this.rank)
            // it follows the above rule and gives the descending order.
        }
    }
    public static void main(String[] args) {
        // Creating a queue to hold students in ascending order by rank
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 4)); // Adding student A with rank 4
        pq.add(new Student("B", 5)); // Adding student B with rank 5
        pq.add(new Student("C", 12)); // Adding student C with rank 12
        pq.add(new Student("D", 2)); // Adding student D with rank 2
        pq.add(new Student("E", 10)); // Adding student E with rank 10
        
        System.out.println("In Ascending Order");
        // Printing students in order of their ranks (smallest first)
        while (!pq.isEmpty()) {
            System.out.println(pq.peek().name +" -> "+pq.peek().rank); // Look at the student with the smallest rank
            pq.remove(); // Remove the student we just looked at
        }

        // Creating a new queue to hold students in descending order by rank
        PriorityQueue<Student> pq1 = new PriorityQueue<>(Comparator.reverseOrder());
        pq1.add(new Student("A", 4)); // Adding student A with rank 4
        pq1.add(new Student("B", 5)); // Adding student B with rank 5
        pq1.add(new Student("C", 12)); // Adding student C with rank 12
        pq1.add(new Student("D", 2)); // Adding student D with rank 2
        pq1.add(new Student("E", 10)); // Adding student E with rank 10
        
        System.out.println("In Descending Order");
        // Printing students in order of their ranks (biggest first)
        while (!pq1.isEmpty()) {
            System.out.println(pq1.peek().name +" -> "+pq1.peek().rank); // Look at the student with the biggest rank
            pq1.remove(); // Remove the student we just looked at
        }

        // Creating a new queue for tasks with custom priority
        PriorityQueue<Task> taskQueue = new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task t1, Task t2) {
                return Integer.compare(t1.priority, t2.priority); // Compare tasks by priority
            }
        });

        taskQueue.offer(new Task(2, "Do laundry")); // Add task with priority 2
        taskQueue.offer(new Task(1, "Complete Assignment")); // Add task with priority 1
        taskQueue.offer(new Task(3, "Buy groceries")); // Add task with priority 3
        
        while (!taskQueue.isEmpty()) {
            Task task = taskQueue.poll(); // Get the task with the highest priority
            System.out.println("Task: "+task.Description+", Priority: "+task.priority); // Print the task
        }
    }
}

// A class to represent tasks with a priority and description
class Task {
    int priority; // How important the task is
    String Description; // What the task is about
    public Task(int priority, String Description){
        this.priority = priority; // Set the task's priority
        this.Description = Description; // Set the task's description
    }
}
