import java.util.*;

public class HasPath_3 {

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

    public static boolean hasPath(ArrayList<edge> graph[], int src, int dest, boolean visited[]){
        if (src == dest) {
            return true;
        }
        visited[src] = true;
        for (int i = 0; i < graph[src].size(); i++) {
            edge e = graph[src].get(i);
            if (!visited[e.destination] && hasPath(graph, e.destination, dest, visited)) {
                return true;
            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // crreating a graph
        //    1-----3
        //   /      | \
        //  0       |  5 --- 6
        //   \      | /
        //    2-----4
        ArrayList<edge> grph[] = new ArrayList[7];
        createGraph(grph);
        // connectedVertex(grph, 0);
        System.out.println(hasPath(grph, 0, 7, new boolean[7]));
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