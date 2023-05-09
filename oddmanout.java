//https://open.kattis.com/problems/oddmanout
import java.util.Scanner;

public class oddmanout {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for (int i = 1; i <= n; i++) {
            int g = in.nextInt();
            int[] arr = new int[g];
            for (int j = 0; j < g; j++) {
                arr[j] = in.nextInt();
            }
            sort(arr);
            for (int j = 1; j < g; j += 2) {
                if (arr[j] != arr[j-1]) {
                    System.out.println("Case #" + i + ": " + arr[j-1]);
                    break;
                }

                //checks if at end of the arr
                if (j + 1 == g - 1) {
                    System.out.println("Case #" + i + ": " + arr[j+1]);
                }
            }
        }

        in.close();
    }

    public static void sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}

//super bad code, but it is what it is