
//https://open.kattis.com/problems/racingalphabet
import java.util.*;

public class racingalphabet {
    public static final double DISKLENGTH = 2 * Math.PI * 30 / 28;
    public static final String APHORISM = "ABCDEFGHIJKLMNOPQRSTUVWXYZ '";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine();
            int steps = 0;
            int cur = APHORISM.indexOf(line.charAt(0));
            for (int j = 1; j < line.length(); j++) {
                int nxt = APHORISM.indexOf(line.charAt(j));

                int diff = Math.abs(cur - nxt);

                steps += 28 - diff >= diff ? diff : 28 - diff;

                cur = nxt;
            }

            System.out.println((line.length()) + (steps * DISKLENGTH / 15));
        }
        in.close();
    }
}