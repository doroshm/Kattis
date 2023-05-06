import java.util.Scanner;

public class isithalloween {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String m = in.next();
        int d = in.nextInt();
        in.close();
        if ((m.equals("OCT") && d == 31) || (m.equals("DEC") && d == 25)) {
            System.out.println("yup");
        } else {
            System.out.println("nope");
        }
        
    }
}