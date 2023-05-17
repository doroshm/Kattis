
//https://open.kattis.com/problems/taisformula
import java.util.*;

public class taisformula {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double[] arr = new double[n*2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextDouble();
        }
        in.close();

        double sum = 0;
        for (int i = arr.length-1; i >= 3; i -= 2) {
            sum += ((arr[i] + arr[i-2])/2) * (arr[i-1] - arr[i-3]);
        }
        System.out.println(sum/1000);
    }
}