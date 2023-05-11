
//https://open.kattis.com/problems/grading
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] limits = new int[6];
        char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
        for (int i = 0; i < 5; i++) {
            limits[i] = in.nextInt();
        }
        int exam = in.nextInt();
        in.close();
        for (int i = 0; i <= 5; i++) {
            if (exam >= limits[i]) {
                System.out.println(grades[i]);
                break;
            }
        }
    }
}
