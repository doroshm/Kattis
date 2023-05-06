//https://open.kattis.com/problems/metronome
import java.util.Scanner;

public class metronome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Double x = in.nextDouble();
        System.out.println(x / 4);
        in.close();
    }
}
