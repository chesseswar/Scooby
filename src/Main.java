import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int numCases = in.nextInt(); in.nextLine();
        for (int i = 0; i < numCases; i++){
            String[] connections = in.nextLine().split(" ");
            Graph graph = new Graph(connections.length);
            for (String str : connections){
                graph.connect(str.charAt(0), str.charAt(1));
            }

            String path = in.nextLine();
            System.out.println(graph.pathExists(path.charAt(0), path.charAt(1)) ? "yes" : "no");
        }
    }
}
