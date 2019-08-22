import java.util.Scanner;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int length = scanner.nextInt();
        int[] array = new int[length];
//        boolean answer = false;

        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }

        //System.out.println(Arrays.toString(array));

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        //System.out.println("n = " + n);
        //System.out.println("m = " + m);

        for (int x = 0; x < array.length - 1; x++) {
            if ((n == array[x] && m == array[x + 1]) || (m == array[x] && n == array[x + 1])) {
//                answer = true;
                System.out.println(true);
//                break;
                return;
            }

        }
        System.out.println(false);
    }
}
