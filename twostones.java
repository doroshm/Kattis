//https://open.kattis.com/problems/twostones
import java.util.Scanner;

public class twostones {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        
        if (x % 2 == 1) {
            System.out.println("Alice");
        } else {
            System.out.println("Bob");
        }

        in.close();
    }
}
