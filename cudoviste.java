import java.util.Scanner;

public class cudoviste {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();
        int c = in.nextInt();
        int[] out = new int[5];

        String[] map = new String[r];
        for (int i = 0; i < map.length; i++) {
            map[i] = in.next();
        }

        in.close();

        for (int i = 0; i < map.length - 1; i++) {
            String line1 = map[i];
            String line2 = map[i + 1];

            for (int j = 0; j < c - 1; j++) {
                if (line1.charAt(j) != '#' && line1.charAt(j + 1) != '#' && line2.charAt(j) != '#' && line2.charAt(j + 1) != '#') {
                    int cars = 0;
                    cars += test(line1.substring(j, j + 2));
                    cars += test(line2.substring(j, j + 2));
                    out[cars]++;
                }
            }
        }

        for (int i = 0; i < out.length; i++) {
            System.out.println(out[i]);
        }
    }

    public static int test(String x) {
        switch (x) {
            case "X.":
            case ".X":
                return 1;
            case "XX":
                return 2;
        }

        return 0;
    }
}
