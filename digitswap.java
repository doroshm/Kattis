//https://open.kattis.com/problems/digitswap
import java.util.Scanner;

public class digitswap {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String x = in.next();
        System.out.println(x.charAt(1) + "" + x.charAt(0));
        in.close();
    }
}
