//https://open.kattis.com/problems/r2
import java.util.*;

public class r2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int R1 = in.nextInt();
        int S = in.nextInt();
        
        S *= 2;
        S -= R1;

        System.out.println(S);
        in.close();
    }
}
