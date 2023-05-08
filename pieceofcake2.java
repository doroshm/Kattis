
//https://open.kattis.com/problems/pieceofcake2
import java.util.Scanner;

public class pieceofcake2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), h = in.nextInt(), v = in.nextInt();
        in.close();
        if (n - h > h) {
            h = n - h;
        }

        if (n - v > v) {
            v = n - v;
        }

        System.out.println(h * v * 4);
    }
}