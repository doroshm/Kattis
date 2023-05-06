import java.util.Scanner;

public class heimavinna {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        in.close();
        Scanner line = new Scanner(s).useDelimiter("\\s*;\\s*");
        int sum = 0;
        while(line.hasNext()) {
            String x = line.next();
            if (x.contains("-")) {
                String[] arr = x.split("-");
                sum += Integer.parseInt(arr[1]) - Integer.parseInt(arr[0]) + 1;
            } else {
                sum++;
            }
        }
        line.close();
        System.out.println(sum);
    }
}
