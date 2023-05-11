
//https://open.kattis.com/problems/icpcawards
import java.util.Scanner;

public class icpcawards {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int total = 0;
        String[] arr = new String[12]; //still haven't learned hashets yet LOL
        for (int i = 0; i < n; i++) {
            if (total != 12) {
                String uni = in.next();
                boolean copy = false;
                for (int j = 0; j < total; j++) {
                    if (arr[j].equals(uni)) {
                        copy = true;
                        break;
                    }
                }

                String team = in.next();

                if (!copy) {
                    total++;
                    arr[total - 1] = uni;
                    System.out.println(uni + " " + team);
                }
                
            } else {
                in.next();
                in.next();
            }
        }
        in.close();
    }
}