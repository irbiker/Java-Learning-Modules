import java.util.Arrays;
import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int row = scanner.nextInt();
    int column = scanner.nextInt();

    int[][] array = new int[row][column];

    for (int x = 0; x < row; x++){
      for (int y = 0; y < column; y++){
        array[x][y] = scanner.nextInt();
      }
    }
//    for (int a = 0; a < row; a++) {
//      for (int b = 0; b < column; b++) {
//        System.out.print(array[a][b]);
//      }
//    }
//    for (int a = 0; a < row; a++){
    int a =0;
      for (int b = 0; b < column; b++){
        System.out.print(array[a][b] +" ");
        a = a+1;
        System.out.print(array[a][b] +" ");
        a = a-1;
//      }
    }
  }
}