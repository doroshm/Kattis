
//https://open.kattis.com/problems/jobexpenses
import java.util.Scanner;

public class jobexpenses {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int out = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x < 0) {
                out += x;
            }
        }
        in.close();
        System.out.println(Math.abs(out));
    }
}