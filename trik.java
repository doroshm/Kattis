//https://open.kattis.com/problems/trik
import java.util.Scanner;

public class trik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        in.close();

        int ball = 1;

        for (int i = 0; i < line.length(); i++) {
            char letter = line.charAt(i);

            if (letter == 'A') {
                if (ball == 1) {
                    ball = 2;
                } else if (ball == 2) {
                    ball = 1;
                }
            } else if (letter == 'B') {
                if (ball == 2) {
                    ball = 3;
                } else if (ball == 3) {
                    ball = 2;
                }
            } else {
                if (ball == 3) {
                    ball = 1;
                } else if (ball == 1) {
                    ball = 3;
                }
            }
        }

        System.out.println(ball);
    }
}
