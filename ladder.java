//https://open.kattis.com/problems/ladder
import java.util.Scanner;

public class ladder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println((int)Math.ceil(in.nextInt() / Math.sin(Math.toRadians(in.nextInt()))));
        in.close();
    }
}