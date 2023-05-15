
//https://open.kattis.com/problems/addingtrouble
import java.util.Scanner;

public class addingtrouble {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String out = "wrong!";
        if (in.nextInt() + in.nextInt() == in.nextInt()) {
            out = "correct!";
        }
        in.close();
        System.out.println(out);
    }

}
