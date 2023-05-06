//https://open.kattis.com/problems/skruop
import java.util.Scanner;

public class skruop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int vol = 7;
        for (int i = 0; i < n; i++) {
            in.next();
            String s = in.next();
            if (s.equals("op!")) {
                vol++;
            } else {
                vol--;
            }

            if (vol > 10) {
                vol = 10;
            } else if (vol < 0) {
                vol = 0;
            }
        }
        in.close();
        System.out.println(vol);
    }
}
