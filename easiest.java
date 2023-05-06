import java.util.Scanner;

public class easiest {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        while (N != 0) {
            int sumN = sum(N);
            int p = 11;
            while (true) {
                if (sumN == sum(N * p)) {
                    break;
                } else {
                    p++;
                }
            }
            System.out.println(p);
            N = in.nextInt();
        }

        in.close();
    }

    public static int sum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }

        return sum;
    }
}
