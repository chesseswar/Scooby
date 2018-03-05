import java.util.*;

public class Graph {
    LinkedList<Integer>[] vertices;
    int size;
    int edges;
    public Graph(int numVert){
        vertices = new LinkedList[numVert];
        size = numVert;
        edges = 0;

        for (int i = 0; i < vertices.length; i++){
            vertices[i] = new LinkedList<>();
        }
    }

    public void addEdge(int first, int second){
        vertices[first].addFirst(second);
        vertices[second].addFirst(first);
        edges++;
    }

    public Iterable<Integer> connections(int vertex){
        return vertices[vertex];
    }

    public boolean pathExists(int first, int second){
        DepthFirstSearch dfs = new DepthFirstSearch(this, first);
        return dfs.pathExists(second);
    }
}
