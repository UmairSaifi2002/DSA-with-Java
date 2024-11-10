import java.util.*;

public class Detect_Cycle_4 {

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < 4; i++) {
            graph[i] = new ArrayList<>();
        }
        // for 0 - vertex
        graph[0].add(new edge(0, 2, 1));
        // for 1 -vertex
        graph[1].add(new edge(1, 0, 1));
        // for 2 - vertex
        graph[2].add(new edge(2, 3, 1));
        // for 3 - vertex
        graph[3].add(new edge(3, 0, 1));
    }

    public static void connectedVertex(ArrayList<edge> graph[], int index) {
        for (int i = 0; i < graph[index].size(); i++) {
            System.out.println(graph[index].get(i).dest);
        }
    }

    public static boolean isCycleInDirectedGraph(ArrayList<edge> graph[], boolean visit[], int curr, boolean reccurStack[]) {
        // Mark the current node as visited.
        visit[curr] = true;

        // Mark the current node as present in the recursion stack.
        reccurStack[curr] = true;

        // Iterate over all neighbors of the current node.
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            // If the neighbor is already in the recursion stack, a cycle is detected.
            if (reccurStack[e.dest]) {
                // Return immediately, cycle found.
                return true;
            }
            // If the neighbor has not been visited, recursively explore its neighbors.
            else if (!visit[e.dest]) {
                // Recursively check for cycles from the neighbor.
                if (isCycleInDirectedGraph(graph, visit, e.dest, reccurStack)) {
                    // Cycle found in the neighbor's subtree.
                    return true;
                }
            }
        }

        // Remove the current node from the recursion stack.
        reccurStack[curr] = false;

        // No cycle detected from this node.
        return false;
    }

    // function : To Detect a cycle in a Directed Graph
    // public static boolean isCycle(){}

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // create a graph this is a directed graph
        // 1 -> 0, 0 -> 2, 2 -> 3, 3-> 0
        /*
         * 1 ---> 0 <- 3
         *        |    ^
         *        |   /
         *      down /
         *         \2
         *
         */
        ArrayList<edge> graph[] = new ArrayList[4];
        createGraph(graph);
        connectedVertex(graph, 0);
        // System.out.println(isCycle(graph, new boolean[4], 0, new boolean[4]));

        boolean visit[] = new boolean[4];
        boolean reccurStack[] = new boolean[4];

        for (int i = 0; i < 4; i++) {
            if (!visit[i]) {
                boolean cycleDetect = isCycleInDirectedGraph(graph, visit, i, reccurStack); 
                if (cycleDetect) {
                    System.out.println(cycleDetect);
                    break;
                }
            }
        }
    }
}

class edge {
    int src;
    int dest;
    int wht;

    edge(int src, int dest, int wht) {
        this.src = src;
        this.dest = dest;
        this.wht = wht;
    }
}
