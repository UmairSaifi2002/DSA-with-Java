import java.util.*;

public class Basics_of_Graphs {

    public static void createGraph(ArrayList<edge> graph[]){
        for (int i = 0; i < 5; i++) {
            graph[i] = new ArrayList<>(); // here we make null to empty arraylist
        }
        // for 0 - vertex
        graph[0].add(new edge(0, 1, 5));
        // for 1 - vertex
        graph[1].add(new edge(1, 0, 5));
        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 3));
        // for 2 - vertex
        graph[2].add(new edge(2, 1, 1));
        graph[2].add(new edge(2, 3, 1));
        graph[2].add(new edge(2, 4, 2));
        // for 3 - vertex
        graph[3].add(new edge(3, 2, 1));
        graph[3].add(new edge(3, 1, 3));
        // for 4 - vertex
        graph[4].add(new edge(4, 2, 2));
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        // Creating a Graph
        // Using Adjacency list Method
        int size = 5;
        ArrayList<edge> graph[] = new ArrayList[size]; // here we created a null graph
        
        createGraph(graph);
         
        // now i want to know that vertex 2 is connected how many of other vertexes
        int i = 0;
        while (i < graph[2].size()) { 
            System.out.println(graph[2].get(i).dest);
            i++;
        }
    }
}

class edge{
    int src;
    int dest;
    int weight;
    edge(int s, int d, int w){
        this.src = s;
        this.dest = d;
        this.weight = w;
    }
}