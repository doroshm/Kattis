//https://open.kattis.com/problems/quadrant
import java.util.*;

public class quadrant {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        double x = in.nextDouble();
        double y = in.nextDouble();
        
        System.out.println((x < 0) ? (y < 0 ? 3 : 2) : (y < 0 ? 4 : 1));
        
        in.close();
    }
}
