
//https://open.kattis.com/problems/simonsays
import java.util.*;

public class simonsays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            if (line.contains("Simon says ")) {
                System.out.println(line.substring(11));
            }
        }
        in.close();
    }
}