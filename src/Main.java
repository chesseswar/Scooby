import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int numCases = in.nextInt(); in.nextLine();
        for (int i = 0; i < numCases; i++){
            HashMap<Character, Integer> roomCodes = new HashMap<>();
            String input = in.nextLine();
            String[] connections = input.split(" ");
            char[] insert = input.toCharArray();
            int index = 0;
            for (char c : insert){
                if (c != ' ' && !roomCodes.containsKey(c)){
                    roomCodes.put(c, index);
                    index++;
                }
            }

            Graph graph = new Graph(index+1);
            for (String str : connections){
                graph.addEdge(roomCodes.get(str.charAt(0)), roomCodes.get(str.charAt(1)));
            }

            String path = in.nextLine();
            System.out.println(graph.pathExists(roomCodes.get(path.charAt(0)), roomCodes.get(path.charAt(1))) ? "yes" : "no");
        }
    }
}
