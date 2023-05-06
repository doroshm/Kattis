//https://open.kattis.com/problems/ghostleg
import java.util.Scanner;

public class ghostleg {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[in.nextInt()];
        int m = in.nextInt();

        // fill arr w/ nums
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }

        // iterate through each rung for each num in arr
        for (int i = 0; i < m; i++) {
            int rung = in.nextInt();
            int copy = arr[rung];
            arr[rung] = arr[rung - 1];
            arr[rung - 1] = copy;
        }

        in.close();

        // display results
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
