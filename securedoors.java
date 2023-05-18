
//https://open.kattis.com/problems/securedoors
import java.util.*;

public class securedoors {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        ArrayList<String> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = in.nextLine(), out, name;
            boolean inside;
            if (line.contains("entry")) {
                name = line.substring(6);
                out = name + " entered";
                inside = search(list, name);

                if (!inside) {
                    list.add(name);
                } else {
                    out += " (ANOMALY)";
                }

            } else {
                name = line.substring(5);
                out = name + " exited";
                inside = search(list, name);

                if (inside) {
                    list.remove(name);
                } else {
                    out += " (ANOMALY)";
                }
            }
            System.out.println(out);
        }
        in.close();
    }

    public static boolean search(ArrayList<String> list, String name) {
        for (String j : list) {
            if (j.equals(name)) {
                return true;
            }
        }

        return false;
    }
}