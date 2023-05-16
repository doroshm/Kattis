//https://open.kattis.com/problems/squarepegs
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class squarepegs {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cP = in.nextInt(), cH = in.nextInt(), sH = in.nextInt();

        ArrayList<Integer> p = new ArrayList<>();
        ArrayList<Double> h = new ArrayList<>();

        for (int i = 0; i < cP; i++) {
            p.add(in.nextInt());
        }

        for (int i = 0; i < cH; i++) {
            h.add(in.nextDouble());
        }

        for (int i = 0; i < sH; i++) {
            h.add(Math.sqrt(Math.pow(in.nextInt(), 2) / 2));
        }

        in.close();
        Collections.sort(p);
        Collections.sort(h);

        int counter = 0;
        for (int i = 0; i < h.size(); i++) {
            for (int j = 0; j < p.size(); j++) {
                if (h.get(i) < p.get(j)) {
                    counter++;
                    p.remove(j);
                    break;
                }
            }
        }

        System.out.println(counter);
    }
}