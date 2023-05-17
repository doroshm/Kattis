
//https://open.kattis.com/problems/cups
import java.util.*;

public class cups {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        double[] radii = new double[n];
        String[] colors = new String[n];
        for (int i = 0; i < n; i++) {
            String[] line = in.nextLine().split(" ");
            try {
                radii[i] = Double.parseDouble(line[1]);
                colors[i] = line[0];
            } catch (NumberFormatException e) {
                radii[i] = Double.parseDouble(line[0]) / 2;
                colors[i] = line[1];
            }
        }
        in.close();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (radii[i] > radii[j]) {
                    double temp = radii[i];
                    radii[i] = radii[j];
                    radii[j] = temp;

                    String temp2 = colors[i];
                    colors[i] = colors[j];
                    colors[j] = temp2;
                }
            }

            System.out.println(colors[i]);
        }
    }
}