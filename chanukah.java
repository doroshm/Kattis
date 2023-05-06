//https://open.kattis.com/problems/chanukah
import java.util.*;

public class chanukah {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        for (int i = 0; i < cases; i++) {
            System.out.print(in.nextInt() + " ");
            int sum = 0;
            int days = in.nextInt();
            for (int j = 0; j < days; j++) {
                sum += j + 2;
            }
            System.out.print(sum + "\n");
        }
        in.close();
    }
}
