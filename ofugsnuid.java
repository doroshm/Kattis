//https://open.kattis.com/problems/ofugsnuid
import java.util.Scanner;

public class ofugsnuid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = in.nextInt();
        }

        in.close();

        for (int i : arr) {
            System.out.println(i);
        }
    }
}
