
//https://open.kattis.com/problems/skocimis
import java.util.*;

public class skocimis {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = in.nextInt(), B = in.nextInt(), C = in.nextInt();
        in.close();
        int out = B - A - 1;
        if (C - B - 1 > B - A - 1) {
            out = C - B - 1;
        }
        System.out.println(out);
    }
}