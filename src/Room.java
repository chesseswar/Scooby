import java.util.*;

public class Room {
    HashSet<Room> connections;
    char key;

    public Room(char character){
        key = character;
        connections = new HashSet<>();
    }

    public void connect(Room other){
        connections.add(other);
        other.connections.add(this);
    }

    public String toString(){
        String output = key + "\nconnections: ";
        for (Room r : connections){
            output += Character.toString(r.key) + " ";
        }
        return output;
    }
}
