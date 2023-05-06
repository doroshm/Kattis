//https://open.kattis.com/problems/conundrum
import java.util.Scanner;

public class conundrum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        in.close();

        int days = 0;

        for (int i = 0; i < word.length(); i += 3) {
            days += word.charAt(i) != 'P' ? 1 : 0; 
            days += word.charAt(i+1) != 'E' ? 1 : 0; 
            days += word.charAt(i+2) != 'R' ? 1 : 0; 
        }

        System.out.println(days);
    }
}
