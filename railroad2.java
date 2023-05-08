
//https://open.kattis.com/problems/railroad2
import java.util.Scanner;

public class railroad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String out = "possible";
        if ((in.nextInt() * 4 + in.nextInt() * 3) % 2 != 0) {
            out = "impossible";
        }
        in.close();
        System.out.println(out);
    }
}