//https://open.kattis.com/problems/whichisgreater
import java.util.Scanner;

public class whichisgreater {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        int y = in.nextInt();
        
        if ( x > y) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
        in.close();
    }
}
