//https://open.kattis.com/problems/classfieldtrip
import java.util.Scanner;

public class classfieldtrip {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.next() + in.next();
        in.close();

        int temp, size;
        char arr[] = str.toCharArray();
        size = arr.length;
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = (char) temp;
                }
            }
            System.out.print(arr[i]);
        }

    }
}
