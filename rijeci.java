
//https://open.kattis.com/problems/rijeci
import java.util.*;

public class rijeci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), A = 1, B = 0;
        in.close();
        for (int i = 0; i < n; i++) {
            B += A;
            A = B - A;
        }
        System.out.println(A + " " + B);
    }
}