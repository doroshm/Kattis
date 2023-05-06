//https://open.kattis.com/problems/stickykeys
import java.util.Scanner;

public class stickykeys {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String text = in.nextLine();
        in.close();
        Scanner line = new Scanner(text);
        while (line.hasNext()) {
            String word = line.next() + " ";
            String out = "";
            for (int i = 0; i < word.length()-1; i++) {
                if (word.charAt(i) == word.charAt(i+1)) {
                    continue;
                }
                out += word.charAt(i);
            }
            System.out.print(out + " ");
        }
        line.close();
    }
}
