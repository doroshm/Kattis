
//https://open.kattis.com/problems/internationaldates
import java.util.Scanner;

public class internationaldates {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] date = in.next().split("/");
        in.close();
        String out = "";
        if (Integer.parseInt(date[0]) > 12) {
            out = "EU";
        } else if (Integer.parseInt(date[1]) > 12) {
            out = "US";
        } else {
            out = "either";
        }
        System.out.println(out);
    }
}