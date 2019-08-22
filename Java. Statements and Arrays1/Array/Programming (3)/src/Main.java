import java.util.Scanner;
import java.util.Arrays;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] array = new int[len];

    for (int i = 0; i < array.length; i++) {
      array[i] = scanner.nextInt();
    }

    int tempStorage1 = 0;

    if (array.length == 1) {
        System.out.print(array[0]);
        return;

    }
      for (int x = array.length; x > 0; x--) {
        if (x == array.length) {
          tempStorage1 = array[x - 1];
        } else {
          array[x] = array[x - 1];
        }
      }

      array[0] = tempStorage1;
      for (int y = 0; y < array.length; y++) {
        System.out.print(array[y] + " ");
      }
    }
  }

