//https://open.kattis.com/problems/detaileddifferences
import java.util.Scanner;

public class detaileddifferences {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            String line1 = in.next();
            System.out.println(line1);
            String line2 = in.next();
            System.out.println(line2);
            //String symbols = "";
            for (int j = 0; j < line1.length(); j++) {
                if (line1.charAt(j) == line2.charAt(j)) {
                    //symbols += ".";
                    System.out.print(".");
                } else {
                    //symbols += "*";
                    System.out.print("*");
                }
            }
            //System.out.println(line1);
            //System.out.println(line2);
            //System.out.print(symbols);
            System.out.println();
        }
        in.close();
    }
}
