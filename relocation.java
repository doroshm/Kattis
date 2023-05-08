
//https://open.kattis.com/problems/relocation
import java.util.Scanner;

public class relocation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int c = in.nextInt();
        int q = in.nextInt();
        int[] arr = new int[c];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }

        for (int i = 0; i < q; i++) {
            if (in.nextInt() == 1) {
                arr[in.nextInt() - 1] = in.nextInt();
            } else {
                System.out.println(Math.abs(arr[in.nextInt() - 1] - arr[in.nextInt() - 1]));
            }
        }

        in.close();
    }
}