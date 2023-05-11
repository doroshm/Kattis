
//https://open.kattis.com/problems/grading
import java.util.Scanner;

public class grading {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] limits = new int[5];
        char[] grades = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i < 5; i++) {
            limits[i] = in.nextInt();
        }
        int exam = in.nextInt();
        in.close();
        char out = 'F';
        for (int i = 0; i < 5; i++) {
            if (exam >= limits[i]) {
                out = grades[i];
                break;
            }
        }
        System.out.println(out);
    }
}