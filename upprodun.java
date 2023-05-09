
//https://open.kattis.com/problems/upprodun
import java.util.Scanner;

public class upprodun {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), m = in.nextInt(), extra = m - (m/n*n);
        in.close();
        for (int i = 0; i < n; i++) {
            if (extra != 0) {
                extra--;
                System.out.print("*");
            }

            for (int j = 0; j < m/n; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }

}