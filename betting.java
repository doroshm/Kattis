import java.util.Scanner;

public class betting {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        
        System.out.println(100/x);
        System.out.println(100/(100-x));

        in.close();
    }
}
