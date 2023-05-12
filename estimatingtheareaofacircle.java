//https://open.kattis.com/problems/estimatingtheareaofacircle
import java.util.Scanner;

public class estimatingtheareaofacircle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double r = in.nextDouble(), m = in.nextDouble(), c = in.nextDouble();
        while (r != 0) {
            System.out.println(Math.PI * Math.pow(r, 2) + " " + c/m * Math.pow(r*2, 2));
            r = in.nextDouble();
            m = in.nextDouble();
            c = in.nextDouble();
        }
        in.close();
    }
}
