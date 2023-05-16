
//https://open.kattis.com/problems/simplicity
import java.util.*;

public class simplicity {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String word = in.next();
        in.close();

        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < word.length(); i++) {
            boolean unique = true;
            for (int j = 0; j < list.size(); j++) {
                if (list.get(j) == word.charAt(i)) {
                    unique = false;
                    break;
                }
            }

            if (unique) {
                list.add(word.charAt(i));
            }
        }

        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            int counter = 0;
            for (int j = 0; j < word.length(); j++) {
                if (list.get(i) == word.charAt(j)) {
                    counter++;
                }
            }
            arr[i] = counter;
        }

        Arrays.sort(arr);

        int sum = 0;
        for (int i = 0; i < arr.length - 2; i++) {
            sum += arr[i];
        }
        
        System.out.println(sum);
    }
}