//https://open.kattis.com/problems/fiftyshades
import java.util.Scanner;

public class fiftyshades {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), sum = 0;
        for (int i = 0; i < n; i++) {
            String x = in.next().toLowerCase();
            if (x.contains("pink") || x.contains("rose")) {
                sum++;
            }
        }
        in.close();
        if (sum != 0) {
            System.out.println(sum);
        } else {
            System.out.println("I must watch Star Wars with my daughter");
        }
    }
}
