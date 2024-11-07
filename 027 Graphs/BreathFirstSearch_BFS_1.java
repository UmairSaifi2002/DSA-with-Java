import java.util.*;
import java.util.Queue;

public class BreathFirstSearch_BFS_1 {

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

    public static void BFS(ArrayList<edge> graph[]){
        // traverse the graph as BFS breath first search
        Queue<Integer> q = new LinkedList<>(); // created a queue for track the nodes
        boolean visit[] = new boolean[graph.length]; // this array reminds that you visited the node or not
        
        q.add(0); // add the first index in queue

        // our main work starts here
        while (!q.isEmpty()) { // run until the queue will empty
            int curr = q.remove(); // track the node
            if (!visit[curr]) { // check node is visited ?
                // if it is not visited
                System.out.print(curr+", "); // first print the node
                visit[curr] = true; // marked the node is visited
                for (int i = 0; i < graph[curr].size(); i++) {
                    q.add(graph[curr].get(i).destination); // add its connected nodes to the queue
                }
            }
        }
        System.out.println();
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // This is a graph in which we want to traverse using 
        // BFS - Breath first search
        //    1-----3
        //   /      | \
        //  0       |  5 --- 6
        //   \      | /
        //    2-----4

        ArrayList<edge> graph[] = new ArrayList[7];
        createGraph(graph);
        // connectedVertex(graph, 0);
        BFS(graph);
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
