
//https://open.kattis.com/problems/sevenwonders
import java.util.*;

public class sevenwonders {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.next();
        in.close();
        int T = 0, C = 0, G = 0;
        for (int i = 0; i < line.length(); i++) {
            switch (line.charAt(i)) {
                case 'T':
                    T++;
                    break;
                case 'C':
                    C++;
                    break;
                default:
                    G++;
            }
        }
        int sets = Math.min(Math.min(C, T), G);
        System.out.println((T * T) + (C * C) + (G * G) + (sets * 7));
    }
}