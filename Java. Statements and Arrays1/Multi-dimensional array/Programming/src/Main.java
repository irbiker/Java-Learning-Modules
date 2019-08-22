import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int[][] array = new int[n][n];
    boolean answer = true;

    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
        array[x][y] = scanner.nextInt();
      }
    }
    for (int a = 0; a < n; a++) {
      if (!answer){
        break;
      }for (int b = 0; b < n; b++) {
        if (array[a][b] != array[b][a]) {
          answer = false;
          break;
        }
      }
    }if (answer){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}