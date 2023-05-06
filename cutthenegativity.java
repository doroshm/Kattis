import java.util.*;

public class cutthenegativity {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int lines = in.nextInt();

        int total = 0;

        ArrayList<String> outputs = new ArrayList<String>();

        for (int i = 1; i <= lines; i++) {
            for (int j = 1; j <= lines; j++) {
                int x = in.nextInt();
                if (x != -1) {
                    outputs.add(i + " " + j + " " + x);
                    total++;
                }
            }
        }

        System.out.println(total);

        for (int i = 0; i < outputs.size(); i++) {
            System.out.println(outputs.get(i));
        }

        in.close();
    }
}