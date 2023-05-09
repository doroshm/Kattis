//https://open.kattis.com/problems/nodup
import java.util.Scanner;

public class nodup {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] arr = in.nextLine().split(" ");
        in.close();
        String out = "yes";
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i].equals(arr[j])) {
                    out = "no";
                    break;
                }
            }

            if (out.equals("no")) {
                break;
            }
        }
        System.out.println(out);
    }
}