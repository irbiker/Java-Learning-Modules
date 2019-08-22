import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int n = scanner.nextInt();
    int m = scanner.nextInt();

    int[][] array1 = new int[n][m];
    int[][] array2 = new int[n][m];

    for (int x = 0; x < n; x++){
      for (int y = 0; y < m; y++){
        array1[x][y] = scanner.nextInt();
      }
    }

    int i = scanner.nextInt();
    int j = scanner.nextInt();

    int tempI = 0;
    int tempJ = 0;

    int tempValue1 = 0;
    int tempValue2 = 0;

//    for (int x = 0; x < a; x++){
//      System.out.println(Arrays.toString(array1[x]));
//    }
//    System.out.println(i +" " +j);
    for (int x = 0; x < n; x++){
      for (int y = 0; y < m; y++){
        if (y == i){
         tempI = x;
         tempJ = y;
         tempValue1 = array1[x][y];
         tempValue2 = array1[x][j];
         System.out.println(tempI);
         System.out.println(tempJ);
         System.out.println(tempValue1);
         System.out.println(tempValue2);
        }
      }
    }
//        for (int x = 0; x < n; x++){
//      System.out.println(Arrays.toString(array2[x]));
//    }
//    for (int x = 0; x < n; x++){
//      for (int y = 0; y < m; y++){
//        System.out.print(array2[x][y] +" ");
//        if (y == m-1){
//          System.out.println("");
//        }
//      }
//    }
  }
}