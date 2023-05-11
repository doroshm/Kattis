//https://open.kattis.com/problems/turtlemaster
import java.util.Scanner;

public class turtlemaster {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[][] arr = new char[8][8];
        for (int i = 0; i < 8; i++) {
            String line = in.nextLine();
            for (int j = 0; j < 8; j++) {
                arr[i][j] = line.charAt(j);
            }
        }

        String code = in.nextLine();
        String out = "";
        char direction = 'R';
        for (int i = 0; i < code.length(); i++) {
            char cmd = code.charAt(i);
            switch (cmd) {
                case 'F':
                    out = forward(arr, direction);
                    break;
                case 'X':
                    out = fire(arr, direction);
                    break;
                default:
                    direction = turn(cmd, direction);
            }

            // System.out.println("cmd: " + cmd + ", direction: " + direction);
            // for (int k = 0; k < 8; k++) {
            // for (int j = 0; j < 8; j++) {
            // System.out.print(arr[k][j] + " ");
            // }
            // System.out.println();
            // }
            // System.out.println();

            if (out.equals("Bug!")) {
                break;
            }
        }

        if (!out.equals("Diamond!")) {
            System.out.println("Bug!");
        } else {
            System.out.println(out);
        }

        in.close();
    }

    public static String forward(char[][] arr, char currDir) {
        int[] pos = pos(arr);
        boolean success = false, diamond = false, inBound = false, emptySpace = false;
        int row = pos[0], col = pos[1];
        char nextChar = '_';

        switch (currDir) {
            case 'U': // move up
                inBound = pos[0] - 1 > -1;
                nextChar = arr[pos[0] - 1][pos[1]];
                emptySpace = nextChar == '.';
                diamond = nextChar == 'D';
                if (inBound && (emptySpace || diamond)) {
                    row = pos[0] - 1;
                    success = true;
                }
                break;
            case 'L': // move left
                inBound = pos[1] - 1 > -1;
                nextChar = arr[pos[0]][pos[1] - 1];
                emptySpace = nextChar == '.';
                diamond = nextChar == 'D';
                if (inBound && (emptySpace || diamond)) {
                    col = pos[1] - 1;
                    success = true;
                }
                break;
            case 'R': // move right
                inBound = pos[1] + 1 < 8;
                nextChar = arr[pos[0]][pos[1] + 1];
                emptySpace = nextChar == '.';
                diamond = nextChar == 'D';
                if (inBound && (emptySpace || diamond)) {
                    col = pos[1] + 1;
                    success = true;
                }
                break;
            default: // move down
                inBound = pos[0] + 1 < 8;
                nextChar = arr[pos[0] + 1][pos[1]];
                emptySpace = nextChar == '.';
                diamond = nextChar == 'D';
                if (inBound && (emptySpace || diamond)) {
                    row = pos[0] + 1;
                    success = true;
                }
        }

        if (success) {
            arr[pos[0]][pos[1]] = '.';
            arr[row][col] = 'T';

            if (diamond) {
                return "Diamond!";
            } else {
                return "Moved Forward!";
            }
        }

        return "Bug!";
    }

    public static String fire(char[][] arr, char currDir) {
        int[] pos = pos(arr);
        boolean success = false, inBound = false, iceCastle = false;

        switch (currDir) {
            case 'U': // fire up
                inBound = pos[0] - 1 > -1;
                iceCastle = arr[pos[0] - 1][pos[1]] == 'I';
                if (inBound && iceCastle) {
                    pos[0]--;
                    success = true;
                }
                break;
            case 'L': // fire left
                inBound = pos[1] - 1 > -1;
                iceCastle = arr[pos[0]][pos[1] - 1] == 'I';
                if (inBound && iceCastle) {
                    pos[1]--;
                    success = true;
                }
                break;
            case 'R': // fire right
                inBound = pos[1] + 1 < arr.length;
                iceCastle = arr[pos[0]][pos[1] + 1] == 'I';
                if (inBound && iceCastle) {
                    pos[1]++;
                    success = true;
                }
                break;
            default: // fire down
                inBound = pos[0] + 1 < arr.length;
                iceCastle = arr[pos[0] + 1][pos[1]] == 'I';
                if (inBound && iceCastle) {
                    pos[0]++;
                    success = true;
                }
        }

        if (success) {
            arr[pos[0]][pos[1]] = '.';
            return "Ice Castle Melted!";
        }

        return "Bug!";
    }

    public static char turn(char rotate, char currDir) {
        if (rotate == 'L') {
            switch (currDir) {
                case 'U':
                    return 'L';
                case 'L':
                    return 'D';
                case 'D':
                    return 'R';
                default:
                    return 'U';
            }
        }

        switch (currDir) {
            case 'U':
                return 'R';
            case 'R':
                return 'D';
            case 'D':
                return 'L';
            default:
                return 'U';
        }
    }

    public static int[] pos(char[][] arr) {
        int[] pos = { 0, 0 };
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == 'T') {
                    pos[0] = i;
                    pos[1] = j;
                    break;
                }
            }
        }

        return pos;
    }
}