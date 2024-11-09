import java.util.*;

public class TopologicalSorting_5 {

    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < 6; i++) {
            graph[i] = new ArrayList<>();
        }
        // for 0 - vertex - not available
        // for 1 - vertex - not available
        // for 2 - vertex
        graph[2].add(new edge(2, 3, 1));
        // for 3 - vertex
        graph[3].add(new edge(3, 1, 1));
        // for 4 - vertex
        graph[4].add(new edge(4, 0, 1));
        graph[4].add(new edge(4, 1, 1));
        // for 5 - vertex
        graph[5].add(new edge(5, 0, 1));
        graph[5].add(new edge(5, 2, 1));
    }

    public static void connectedWith(ArrayList<edge> graph[], int curr){
        for (int i = 0; i < graph[curr].size(); i++) {
            System.out.println(graph[curr].get(i).dest);
        }
    }

    public static boolean isCycle(ArrayList<edge> graph[], boolean visit[], int curr, boolean reccurStack[]){
        visit[curr] = true;
        reccurStack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (reccurStack[e.dest]) {
                return true;
            }
            else if (!visit[e.dest]) {
                if (isCycle(graph, visit, e.dest, reccurStack)) {
                    return true;
                }
            }
        }
        reccurStack[curr] = true;
        return false;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Topological Sorting
        // Directed Acyclic Graphs (DAG) is a directed graph with no cycles
        // Topological Sorting is use for (DAG's) only
        // it is a linear order of vertices such that every directed edge u->v
        // the vertex u comes before the v in the order.

        // our Graph
        /*
         * 5 - -       - - 4
         * |   - > 0 < -   |
         * |               |
         *down            down
         * 2 - -       - > 1
         *     - > 3 - -
        */
        int v = 6;
        ArrayList<edge> grpah[] = new ArrayList[v];
        createGraph(grpah);
        boolean visit[] = new boolean[v];
        boolean reccurStack[] = new boolean[v];
        System.out.println(isCycle(grpah, visit, 0, reccurStack));
    }
}

class edge{
    int src; 
    int dest;
    int wht;
    edge(int src, int dest, int wht){
        this.src = src;
        this.dest = dest;
        this.wht = wht;
    }
}