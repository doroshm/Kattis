
//https://open.kattis.com/problems/symmetricorder
import java.util.*;

public class symmetricorder {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int set = 1;
        while (n != 0) {
            ArrayList<String> list = new ArrayList<>();
            for (int i = 0; i < n; i++) {
                list.add(in.next());
            }

            System.out.println("SET " + set);
            set++;

            for (int i = 0; i < list.size(); i++) {
                System.out.println(list.get(i));
                list.remove(i);
            }

            for (int i = list.size() - 1; i >= 0; i--) {
                System.out.println(list.get(i));
            }

            n = in.nextInt();
        }
        in.close();
    }
}