import java.util.Scanner;

public class undeadoralive {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String line = in.nextLine();
        in.close();

        Scanner scan = new Scanner(line);
        
        boolean undead = false;
        boolean alive = false;
        String output = "";

        while (scan.hasNext()) {
            String x = scan.next();
            if (x.contains(":)") && x.contains(":(")) {
                alive = true;
                undead = true;
                continue;
            }
            
            if (x.contains(":)")) {
                alive = true;
            } else if (x.contains(":(")) {
                undead = true;
            }
        }

        scan.close();

        if (alive && !undead) {
            output = "alive";
        } else if (!alive && undead) {
            output = "undead";
        } else if (alive && undead) {
            output = "double agent";
        } else {
            output = "machine";
        }

        System.out.println(output);
    }
}
