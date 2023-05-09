
//https://open.kattis.com/problems/numberfun
import java.util.Scanner;

public class numberfun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int y = in.nextInt();
            int t = in.nextInt();
            String out = "Impossible";
            if (x + y == t || x - y == t || y - x == t || x * y == t || (double) x / y == t || (double) y / x == t) {
                out = "Possible";
            }
            System.out.println(out);
        }
        in.close();
    }
}