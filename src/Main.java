import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(new File("input.txt"));
        int numCases = in.nextInt(); in.nextLine();
        for (int i = 0; i < numCases; i++){
            HashMap<Character, HashSet<Character>> rooms = new HashMap<>();
            String[] connections = in.nextLine().split(" ");
            for (String s : connections){
                System.out.println(s);
                char character1 = s.charAt(0);
                char character2 = s.charAt(1);
                if (!rooms.containsKey(character1)) {
                    rooms.put(character1, new HashSet<>());
                }

                if (!rooms.containsKey(character2)){
                    rooms.put(character2, new HashSet<>());
                }

                rooms.get(character1).add(character2);
                rooms.get(character2).add(character1);

                for (Character ch : rooms.keySet()){
                    if (rooms.get(ch).contains(character1)){
                        rooms.get(ch).add(character2);
                    }

                    if (rooms.get(ch).contains(character2)){
                        rooms.get(ch).add(character1);
                    }
                }
            }

            String path = in.nextLine();

            char room1 = path.charAt(0);
            char room2 = path.charAt(1);
            System.out.println(room1);
            System.out.println(rooms.get(room1));
            boolean pathExists = rooms.get(room1).contains(room2);
            System.out.println(pathExists ? "yes" : "no");
        }
    }
}
