
//https://open.kattis.com/problems/rationalsequence2
//still need time to understand this
import java.util.Scanner;

public class rationalsequence2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int c = 1; c <= n; c++) {
            in.nextInt();
            String[] fraction = in.next().split("/");
            int num = Integer.parseInt(fraction[0]);
            int den = Integer.parseInt(fraction[1]);

            String binaryRoute = "";
            while (num > 1 || den > 1) {
                if (den > num) {
                    den -= num;
                    binaryRoute = '0' + binaryRoute;
                } else {
                    num -= den;
                    binaryRoute = '1' + binaryRoute;
                }
            }

            int k = 1;
            for (int i = 0; i < binaryRoute.length(); i++) {
                char letter = binaryRoute.charAt(i);
                k *= 2;
                if (letter == '1') {
                    k++;
                }
            }

            System.out.println(c + " " + k);
        }
        in.close();
    }
}
