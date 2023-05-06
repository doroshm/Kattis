//https://open.kattis.com/problems/cprnummer
import java.util.Scanner;

public class cprnummer {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String CPR = in.next();
        in.close();
        int[] values = { 4, 3, 2, 7, 6, 5, 0, 4, 3, 2, 1 };
        int total = 0;

        for (int i = 0; i < CPR.length(); i++) {
            char x = CPR.charAt(i);
            if (x == '-') {
                continue;
            }

            int y = Character.getNumericValue(x);
            total += y * values[i];
        }

        System.out.println(total % 11 == 0 ? 1 : 0);
    }
}
