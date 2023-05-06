import java.util.Scanner;

public class speedlimit {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (n != -1) {
            int m = 0;
            int t = 0;
            for (int i = 0; i < n; i++) {
                int mph = in.nextInt();
                int h = in.nextInt();
                m += mph * (h - t);
                t = h;
            }
            System.out.println(m + " miles");
            n = in.nextInt();
        }
        in.close();
    }
}