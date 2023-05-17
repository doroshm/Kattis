
//https://open.kattis.com/problems/speeding
import java.util.*;

public class speeding {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] m = new int[n];
        int[] t = new int[n];
        for (int i = 0; i < n; i++) {
            t[i] = in.nextInt();
            m[i] = in.nextInt();
        }
        in.close();

        int top = 0;
        for (int i = 1; i < n; i++) {
            int curr = (m[i] - m[i-1]) / (t[i] - t[i-1]);
            if (curr > top) {
                top = curr;
            }
        }

        System.out.println(top);
    }
}