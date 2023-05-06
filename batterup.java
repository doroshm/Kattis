import java.util.*;

public class batterup {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int bottom = n;
        double total = 0;
        for (int i = 0; i < n; i++) {
            int x = in.nextInt();
            if (x == -1) {
                bottom -= 1;
            } else {
                total += x;
            }
        }
        total /= bottom;
        System.out.println(total);
        in.close();
    }
}
