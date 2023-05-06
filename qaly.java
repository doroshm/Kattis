//https://open.kattis.com/problems/qaly
import java.util.*;

public class qaly {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        float QALY = 0;
        
        for (int i = 0; i < n; i++) {
            float x = in.nextFloat();
            float y = in.nextFloat();
            float z = x * y;
            QALY += z;
        }

        Formatter dec = new Formatter();
        System.out.println(dec.format("%.3f",QALY));
        in.close();
    }
}
