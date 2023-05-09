//https://open.kattis.com/problems/kornislav
import java.util.Scanner;

public class kornislav {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = in.nextInt();
        }
        in.close();   

        for (int i = 0; i < 4; i++) {
            for (int j = i + 1; j < 4; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(arr[0] * arr[2]);
    }
}