
//https://open.kattis.com/problems/pokerhand
import java.util.Scanner;

public class pokerhand {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[13];
        for (int i = 0; i < 5; i++) {
            String x = in.next();
            char y = x.charAt(0);
            switch (y) {
                case 'A':
                    arr[0]++;
                    break;
                case '2':
                    arr[1]++;
                    break;
                case '3':
                    arr[2]++;
                    break;
                case '4':
                    arr[3]++;
                    break;
                case '5':
                    arr[4]++;
                    break;
                case '6':
                    arr[5]++;
                    break;
                case '7':
                    arr[6]++;
                    break;
                case '8':
                    arr[7]++;
                    break;
                case '9':
                    arr[8]++;
                    break;
                case 'T':
                    arr[9]++;
                    break;
                case 'J':
                    arr[10]++;
                    break;
                case 'Q':
                    arr[11]++;
                    break;
                case 'K':
                    arr[12]++;
                    break;
            }
        }
        in.close();
        int out = 1;
        for (int i : arr) {
            if (i != 5) {
                if (i > out) {
                    out = i;
                }
            } else {
                out = 5;
                break;
            }
        }
        System.out.println(out);
    }
}