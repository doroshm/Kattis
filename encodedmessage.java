
//https://open.kattis.com/problems/encodedmessage
import java.util.Scanner;

public class encodedmessage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String x = in.next();
            String out = "";
            int len = x.length(), dec = (int) Math.sqrt(len), start = dec;
            while (start != 0) {
                for (int k = len - start; k >= 0; k -= dec) {
                    out = x.charAt(k) + out;
                }
                start--;
            }
            System.out.println(out);
        }
        in.close();
    }
}
