import java.util.*;

public class Graph {
    HashSet<Character>[] rooms;

    public Graph(int numRooms){
        rooms = new HashSet[numRooms];
        for (HashSet s : rooms){
            s = new HashSet<Character>();
        }
    }

    public void connect(char room1, char room2){
        rooms[(int)room1].add(room2);
        rooms[(int)room2].add(room1);
    }

    public boolean pathExists(char room1, char room2){

    }
}
