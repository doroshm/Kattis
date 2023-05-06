import java.util.*;

public class knightpacking {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        
        if (x % 2 == 1) {
            System.out.println("first");
        } else {
            System.out.println("second");
        }
        in.close();
    }
}
