//https://open.kattis.com/problems/fyi
import java.util.*;

public class fyi {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.next();
        int index = line.indexOf("555");
        if (index == 0) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        in.close();
    }
}
