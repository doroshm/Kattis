//https://open.kattis.com/problems/judgingmoose
import java.util.Scanner;

public class judgingmoose {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int l = in.nextInt(), r = in.nextInt();
        in.close();
        String out = "";
        if (l == 0 && r == 0) {
            out = "Not a moose";
        } else {
            if (l != r) {
                out = "Odd ";
                if (l > r) {
                    out += l*2;
                } else {
                    out += r*2;
                }
            } else {
                out = "Even " + l*2;
            }
        }
        System.out.println(out);
    }
}