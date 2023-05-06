import java.util.Scanner;

public class alphabetspam {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String email = in.next();
        in.close();
        int l = email.length();
        double ws = 0;
        double lc = 0;
        double uc = 0;
        double s = 0;

        for (int i = 0; i < l; i++) {
            char x = email.charAt(i);
            int y = x;
            if (y >= 65 && y <= 90) {
                uc++;
            } else if (y >= 97 && y <= 122) {
                lc++;
            } else if (y == 95) {
                ws++;
            } else {
                s++;
            }
        }

        System.out.println(ws / l + "\n" + lc / l + "\n" + uc / l + "\n" + s / l);
    }
}
