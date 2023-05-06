//https://open.kattis.com/problems/smil
import java.util.Scanner;

public class smil {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String SMIL = in.next() + ">>";
        in.close();
        for (int i = 0; i < SMIL.length(); i++) {
            if (SMIL.charAt(i) == ':' || SMIL.charAt(i) == ';') {
                String x = SMIL.substring(i, i+3);
                String y = SMIL.substring(i, i+2);
                if (y.contains(":)") || y.contains(";)")) {
                    System.out.println(i);
                    continue;
                }

                if (x.contains(":-)") || x.contains(";-)")) {
                    System.out.println(i);
                }
            }
        }
    }
}
