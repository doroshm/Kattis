
//https://open.kattis.com/problems/humancannonball2
import java.util.*;

public class humancannonball2 {
    public static final double G = 9.81;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            double v = in.nextDouble(),
                    a = in.nextDouble(),
                    x = in.nextDouble(),
                    h1 = in.nextDouble() + 1,
                    h2 = in.nextDouble() - 1;

            double t = x / (v * Math.cos(Math.toRadians(a)));
            double y = v * t * Math.sin(Math.toRadians(a)) - 0.5 * G * (t * t);

            String out = "Not Safe";
            if (y >= h1 && y <= h2) {
                out = "Safe";
            }

            System.out.println(out);
        }

        in.close();
    }
}