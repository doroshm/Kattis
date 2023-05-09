//https://open.kattis.com/problems/lastfactorialdigit
import java.util.Scanner;

public class lastfactorialdigit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            int f = 1;
            while (x != 1) {
                f *= x;
                x--;
            }
            System.out.println(f % 10);
        }
        in.close();
    }
}