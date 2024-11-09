import java.util.*;
import java.util.LinkedList;
import java.util.Queue;

public class All_Path_from_Source_to_Target_4 {

    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < 7; i++) {
            graph[i] = new ArrayList<>();
        }
        // for 0 - vertex
        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));
        // for 1 - vertex
        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));
        // for 2 - vertex
        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));
        // for 3 - vertex
        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));
        // for 4 - vertex
        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));
        // for 5 - vertex
        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));
        // for 6 - vertex
        graph[6].add(new edge(6, 1, 1));
    }

    public static void connectedVertex(ArrayList<edge> graph[], int index){
        for (int i = 0; i < graph[index].size(); i++) {
            System.out.println(graph[index].get(i).destination);
        }
    }

    public static void AllPathFromSourceToDestination(ArrayList<edge> graph[], boolean visit[],int curr, int destination, String path){
        // Base Case: If current node is the destination, print the path.
        if (curr == destination) {
            System.out.println(path);
            return;
        }
        // Iterate over all neighbors of the current node.
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
    
            // Check if the neighbor has not been visited in this iteration.
            if (!visit[e.destination]) {
                // Mark the current node as visited.
                visit[curr] = true;
    
                // Recursively explore paths from the neighbor to the destination.
                AllPathFromSourceToDestination(graph, visit, e.destination, destination, path + " -> " + e.destination);
    
                // Unmark the current node to explore other paths.
                visit[curr] = false;
            }
        }
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // creating a graph
        //    1-----3
        //   /      | \
        //  0       |  5 --- 6
        //   \      | /
        //    2-----4
        // using Adjacency list
        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        connectedVertex(graph, 4);
        boolean visited[] = new boolean[graph.length];
        String path = "0"; // add the node here as same as src
        int src = 0, tar = 5;
        AllPathFromSourceToDestination(graph, visited, src, tar, path);
    }
}

class edge{
    int source;
    int destination;
    int weight;
    edge(int s, int d, int w){
        this.source = s;
        this.destination = d;
        this.weight = w;
    }
}
