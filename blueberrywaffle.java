
//https://open.kattis.com/problems/blueberrywaffle
import java.util.Scanner;

public class blueberrywaffle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextInt(), f = in.nextInt();
        in.close();
        double left = Math.round(f/r);
        String out = "up";
        if (left % 2 == 1) {
            out = "down";
        }
        System.out.println(out);
    }

}
