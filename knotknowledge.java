//https://open.kattis.com/problems/knotknowledge
import java.util.Scanner;
import java.util.ArrayList;

public class knotknowledge {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> line1 = new ArrayList<Integer>();
        
        for (int i = 0; i < n; i++) {
            line1.add(in.nextInt());
        }

        while (line1.size() != 1) {
            int index = line1.indexOf(in.nextInt());
            line1.remove(index);
        }

        System.out.println(line1.get(0));

        in.close();
    }
}
