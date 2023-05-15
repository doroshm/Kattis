
//https://open.kattis.com/problems/drmmessages
import java.util.Scanner;

public class drmmessages {
    public static final String LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        in.close();

        System.out.println(merge(rotate(line.substring(0, line.length() / 2)), rotate(line.substring(line.length() / 2))));
    }

    public static String rotate(String text) {
        String out = "";
        int sum = 0;
        for (int i = 0; i < text.length(); i++) {
            sum += LETTERS.indexOf(text.charAt(i));
        }

        for (int i = 0; i < text.length(); i++) {
            int idx = LETTERS.indexOf(text.charAt(i)) + sum;
            while (idx > 25) {
                idx -= 26;
            }
            out += LETTERS.charAt(idx);
        }

        return out;
    }

    public static String merge(String text1, String text2) {
        String out = "";
        for (int i = 0; i < text1.length(); i++) {
            int idx = LETTERS.indexOf(text1.charAt(i)) + LETTERS.indexOf(text2.charAt(i));
            while (idx > 25) {
                idx -= 26;
            }
            out += LETTERS.charAt(idx);
        }
        
        return out;
    }
}
