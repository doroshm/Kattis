
//https://open.kattis.com/problems/harshadnumbers
import java.util.Scanner;

public class harshadnumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.close();
        while (true) {
            int sum = 0;
            int nCopy = n;
            while (nCopy != 0) {
                sum += nCopy % 10;
                nCopy /= 10;
            }

            if (n % sum == 0) {
                System.out.println(n);
                break;
            }

            n++;
        }
    }
}