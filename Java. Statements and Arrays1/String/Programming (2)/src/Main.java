
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String word = scanner.nextLine();
        int wordLength = word.length();
        char[] wordArray = word.toCharArray();
        //System.out.println(wordArray);
        boolean answer = true;

        if (word.length() == 1) {
            System.out.println("yes");
        } else {
            for (int x = 0; x < wordArray.length / 2; x++) {
                if (wordArray[x] == wordArray[(wordLength - 1) - x]) {
                    answer = true;
                } else {
                    answer = false;
                    break;
                }
            }
            if (answer == true) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }
    }
}