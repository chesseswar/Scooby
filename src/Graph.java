import java.util.*;

public class Graph {
    HashSet<Character>[] rooms;
    int numRooms;
    public Graph(int num){
        int numRooms = num;
        rooms = new HashSet[256];
        for (HashSet s : rooms){
            s = new HashSet<Character>();
        }
    }

    public void connect(char room1, char room2){
        rooms[(int)room1].add(room2);
        rooms[(int)room2].add(room1);
    }

    public boolean pathExists(char room1, char room2){
        boolean[] visited = new boolean[rooms.length];
        LinkedList<Character> queue = new LinkedList<>();
        queue.add(room1);
        visited[(int)room1] = true;
        Iterator<Character> i;
        while (queue.size() > 0){
            room1 = queue.pop();
            i = rooms[(int)room1].iterator();
            char current;
            while (i.hasNext()){
                current = i.next();
                if (current == room2){
                    return true;
                }

                if (!visited[(int)current]){
                    visited[(int)current] = true;
                    queue.add(current);
                }
            }
        }
        return false;
    }
}
