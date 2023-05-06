import java.util.Scanner;

public class reversebinary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.close();

        String binary = "";
        while (N != 0) {
            int r = N % 2;
            binary = r + binary;
            N /= 2;
        }

        int out = 0;
        for (int i = binary.length() - 1; i >= 0; i--) {
            char x = binary.charAt(i);
            int y = Character.getNumericValue(x);
            out += y * Math.pow(2, i); 
        }
        System.out.println(out);
    }
}