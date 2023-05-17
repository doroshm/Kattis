
//https://open.kattis.com/problems/tetration
import java.util.*;

public class tetration {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double N = in.nextDouble();
        in.close();
        System.out.println(Math.pow(N, 1/N));
    }
}