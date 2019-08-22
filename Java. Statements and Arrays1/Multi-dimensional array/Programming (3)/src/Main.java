import java.util.Arrays;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int[][] array = new int[n][n];

    for (int a = 0; a < n; a++) {
      for (int b = 0; b < n; b++) {
        if (a == b) {
          array[a][b] = 0;
        } else if (a < b) {
          array[a][b] = (b - a);
        } else{
          array[a][b] = (a - b);
        }
      }
    }
    for (int x = 0; x < n; x++) {
      for (int y = 0; y < n; y++) {
          System.out.print(array[x][y] +" ");
          if(y == n-1){
            System.out.println("");
          }

//      }for (int y = 0; y <= n; y++) {
//        if (y == n){
//          System.out.println("");
//        }else {
//          System.out.print(array[x][y] +" ");
//        }
      }
    }
  }
}
