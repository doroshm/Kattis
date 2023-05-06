import java.util.Scanner;

public class fadingwind {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int h = in.nextInt(); int k = in.nextInt(); int v = in.nextInt(); int s = in.nextInt();
        in.close();

        int output = 0;

        while (h > 0) {
            v += s;
            if (1 > v/10) {
               v -= 1; 
            } else {
                v -= v/10;
            }

            if (v >= k) {
                h++;
            }

            if (0 < v && v < k) {
                h--;
            }

            if (h == 0) {
                v = 0;
            }

            if (v <= 0) {
                h = 0;
                v = 0;
            }

            output += v;

            if (s > 0) {
                s--;
            }
        }

        System.out.println(output);
    }
}
