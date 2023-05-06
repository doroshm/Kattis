//https://open.kattis.com/problems/transitwoes
import java.util.Scanner;

public class transitwoes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt(), t = in.nextInt(), b = in.nextInt();
        
        int[] arr = new int[b * 2 + 1];
        for (int i = 0; i < arr.length; i += 2) {
            arr[i] = in.nextInt();
        }
        
        for (int i = 1; i < arr.length; i += 2) {
            arr[i] = in.nextInt();
        }

        String out = "yes";
        s += arr[0];
        for (int i = 1; i < arr.length; i += 2) {
            int bTime = in.nextInt();
            int bPos = 0;
            while (bPos < s) {
                bPos += bTime;
            }

            s += (bPos - s) + arr[i] + arr[i + 1];
            
            if (s > t) {
                out = "no";
                break;
            }
        }
        in.close();
        System.out.println(out);
    }
}
