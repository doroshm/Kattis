//https://open.kattis.com/problems/pyramids
import java.util.Scanner;

public class pyramids {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int blk = in.nextInt() - 1;
        in.close();
        int h = 1;
        int s = 1;
        while (true) {
            s += 2;
            if (blk - Math.pow(s, 2) >= 0) {
                blk -= Math.pow(s, 2);
                h++;
                continue;
            }
            break;
        }

        System.out.println(h);
    }
}
