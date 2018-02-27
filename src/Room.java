import java.util.*;

public class Room {
    HashMap<Character, Room> connections;
    char key;

    public Room(char character){
        key = character;
    }

    public void connect(Room other){
        connections.put(other.key, other);
        other.connections.put(this.key, this);
    }

    public String toString(){
        String output = key + " " + connections.keySet().toString();
        return output;
    }
}
