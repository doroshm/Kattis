import java.util.Scanner;

public class tarifa {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int total = 0;
        int X = input.nextInt();
        total += X;
        int n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int P = input.nextInt();
            total = total-P+X;
        }

        System.out.println(total);
        input.close();
    }
}
