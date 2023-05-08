
//https://open.kattis.com/problems/provincesandgold
import java.util.Scanner;

public class provincesandgold {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int bp = in.nextInt() * 3 + in.nextInt() * 2 + in.nextInt();
        in.close();
        String out = "";
        if (bp <= 1) {
            out = "Copper";
        } else {
            out = dominion(bp);
        }
        System.out.println(out);

    }

    public static String dominion(int bp) {
        String out = " or ";
        int[] vc = { 8, 5, 2 }, tc = { 6, 3, 0 };
        for (int i = 0; i < vc.length; i++) {
            if (vc[i] <= bp) {
                switch (i) {
                    case 0:
                        out = "Province" + out;
                        break;
                    case 1:
                        out = "Duchy" + out;
                        break;
                    case 2:
                        out = "Estate" + out;
                        break;
                }
                break;
            }

        }

        for (int i = 0; i < tc.length; i++) {
            if (tc[i] <= bp) {
                switch (i) {
                    case 0:
                        return out += "Gold";
                    case 1:
                        return out += "Silver";
                    case 2:
                        return out += "Copper";
                }
            }
        }

        return out;
    }
}