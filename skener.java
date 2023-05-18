
//https://open.kattis.com/problems/skener
import java.util.*;

public class skener {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int R = in.nextInt(), C = in.nextInt(), Zr = in.nextInt(), Zc = in.nextInt();
        for (int i = 0; i < R; i++) {
            String line = in.next();
            int counter = 0;
            while (counter != Zr) {
                for (int c = 0; c < C; c++) {
                    for (int j = 0; j < Zc; j++) {
                        System.out.print(line.charAt(c));
                    }
                }
                System.out.println();
                counter++;
            }
        }
        in.close();
    }
}