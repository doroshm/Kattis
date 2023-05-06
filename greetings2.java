import java.util.*;

public class greetings2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line = in.next();
        int length = line.length()-2;
        String es = "";
        for (int i = 0; i < length; i++) {
            es += "ee";
        }
        System.out.println("h" + es + "y");
        in.close();
    }
}
