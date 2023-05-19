
//https://open.kattis.com/problems/rectanglearea
import java.util.*;

public class rectanglearea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double x1 = in.nextDouble(), y1 = in.nextDouble(), x2 = in.nextDouble(), y2 = in.nextDouble();
        in.close();
        System.out.println(Math.abs((x1 - x2) * (y1 - y2)));
    }
}