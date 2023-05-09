
//https://open.kattis.com/problems/quickestimate
import java.util.Scanner;

public class quickestimate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String c = in.next();
            System.out.println(c.length());
        }
        in.close();
    }
}