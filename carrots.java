//https://open.kattis.com/problems/carrots
import java.util.*;

public class carrots {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = 0;

        for (int i = 0; i < 2; i++) {
            x = in.nextInt();
        }
        
        System.out.println(x);
        in.close();
    }
}
