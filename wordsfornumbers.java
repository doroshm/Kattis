
//https://open.kattis.com/problems/wordsfornumbers
import java.util.Scanner;

public class wordsfornumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while (in.hasNextLine()) {
            Scanner line = new Scanner(in.nextLine());
            String out = "";
            boolean start = true;
            while (line.hasNext()) {
                String word = line.next();
                try {
                    String num = toText(Integer.parseInt(word));
                    if (start) {
                        num = Character.toUpperCase(num.charAt(0)) + num.substring(1);
                    }
                    out += num + " ";
                } catch (Exception e) {
                    out += word + " ";
                }
                start = false;
            }
            start = true;
            line.close();
            System.out.println(out);
        }
        in.close();
    }

    public static String toText(int x) {
        String out = "";
        if (x / 10 > 0) { // double digit
            int b = x % 10;
            int a = x / 10;
            if (x / 10 > 1) { // greater than 19
                switch (a) { // first position
                    case 2:
                        out += "twenty";
                        break;
                    case 3:
                        out += "thirty";
                        break;
                    case 4:
                        out += "forty";
                        break;
                    case 5:
                        out += "fifty";
                        break;
                    case 6:
                        out += "sixty";
                        break;
                    case 7:
                        out += "seventy";
                        break;
                    case 8:
                        out += "eighty";
                        break;
                    case 9:
                        out += "ninety";
                        break;
                }

                if (b != 0) { // second position if not 0
                    return out + "-" + ones(b);
                }

                return out;
            }

            switch (b) { // less than 20
                case 0:
                    return "ten";
                case 1:
                    return "eleven";
                case 2:
                    return "twelve";
                case 3:
                    return "thirteen";
                case 5:
                    return "fifteen";
                case 8:
                    return "eighteen";
                default:
                    return ones(b) + "teen";
            }
        }

        return ones(x); // not double digit
    }

    public static String ones(int x) {
        switch (x) {
            case 1:
                return "one";
            case 2:
                return "two";
            case 3:
                return "three";
            case 4:
                return "four";
            case 5:
                return "five";
            case 6:
                return "six";
            case 7:
                return "seven";
            case 8:
                return "eight";
            case 9:
                return "nine";
            default:
                return "zero";
        }
    }
}