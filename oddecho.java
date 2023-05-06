//https://open.kattis.com/problems/oddecho
import java.util.Scanner;

public class oddecho {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        
        for (int i = 1; i <= n; i++) {
            String word = in.next();
            if (i % 2 == 1) {
                System.out.println(word);
            }
        }
        in.close();
    }
}
