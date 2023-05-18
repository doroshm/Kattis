
//https://open.kattis.com/problems/server
import java.util.*;

public class server {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), t = in.nextInt(), e = 0, sum = 0;
        for (int i = 0; i < n; i++) {
            e += in.nextInt();
            if (e <= t) {
                sum++;
            } else {
                break;
            }
        }
        in.close();
        System.out.println(sum);
    }
}