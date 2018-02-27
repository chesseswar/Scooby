import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int numCases = in.nextInt();
        for (int i = 0; i < numCases; i++){
            HashMap<Character, Room> rooms = new HashMap<>();
            String[] connections = in.nextLine().split(" ");
            for (String s : connections){
                if (!rooms.containsKey(s.charAt(0))){
                    rooms.put(s.charAt(0), new Room(s.charAt(0)));
                }
                if (!rooms.containsKey(s.charAt(1))){
                    rooms.put(s.charAt(1), new Room(s.charAt(1)));
                }

                rooms.get(s.charAt(0)).connect(rooms.get(s.charAt(1)));
            }
        }
    }
}
