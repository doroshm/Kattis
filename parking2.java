
//https://open.kattis.com/problems/parking2
import java.util.Scanner;

public class parking2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int n = in.nextInt(), low = 100, high = 0;
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();
                if (x > high) {
                    high = x;
                }

                if (x < low) {
                    low = x;
                }
            }
            System.out.println((high - low) * 2);
        }
        in.close();
    }
}