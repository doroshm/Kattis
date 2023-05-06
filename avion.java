import java.util.Scanner;

public class avion {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean found = false;
        for (int i = 1; i <= 5; i++) {
            String x = in.next();
            if (x.contains("FBI")) {
                found = true;
                System.out.print(i + " ");
            }
        }

        in.close();

        if (!found) {
            System.out.println("HE GOT AWAY!");
        }
    }
}
