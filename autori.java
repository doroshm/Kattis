//https://open.kattis.com/problems/autori
import java.util.Scanner;

public class autori {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.next();
        String[] words = line.split("-");
        
        for (String letters : words) {
            System.out.print(letters.charAt(0));
        }
        in.close();
    }
}
