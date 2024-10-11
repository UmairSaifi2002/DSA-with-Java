import java.util.PriorityQueue;

public class Nearby_Cars02_Q01 {

    // Class representing a point (car's location)
    static class Point implements Comparable<Point> {
        int x; // x-coordinate of the car
        int y; // y-coordinate of the car
        int distance; // Squared distance from the origin (0, 0)
        int index; // Index of the car in the original array

        // Constructor to initialize a car's location, distance from the origin, and its index
        Point(int x, int y, int distance, int index) {
            this.x = x;
            this.y = y;
            this.distance = distance;
            this.index = index;
        }

        // Overriding the compareTo() method to compare cars by their distances
        @Override
        public int compareTo(Point p2) {
            // Comparing distances to sort in ascending order (closer cars come first)
            return this.distance - p2.distance;
        }
    }

    public static void main(String[] args) {
        // Array of car positions (each car is represented by its x and y coordinates)
        int arr[][] = {{3, 3}, {5, -1}, {-2, 4}};
        int k = 2; // We want to find the 'k' closest cars to the origin (0, 0)

        // Creating a Priority Queue (Min-Heap) to automatically sort cars based on their distance from the origin
        PriorityQueue<Point> p = new PriorityQueue<>();

        // Loop through each car's coordinates
        for (int i = 0; i < arr.length; i++) {
            // Calculate the squared distance of each car from the origin (0, 0)
            int dis = arr[i][0] * arr[i][0] + arr[i][1] * arr[i][1]; // distance² = x² + y²

            // Add the car (as a Point) to the priority queue with its calculated distance
            p.add(new Point(arr[i][0], arr[i][1], dis, i));
        }

        // Retrieve the 'k' closest cars from the priority queue
        for (int i = 0; i < k; i++) {
            // Remove the car with the smallest distance from the queue
            Point a = p.remove();

            // Print the index of the car and its distance
            // Example output: "C0 ... 18" where C0 is the index and 18 is the distance²
            System.out.println("C" + a.index + " ... " + a.distance);
        }
    }
}
