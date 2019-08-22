import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[][] array1 = new int[n][m];
        int[][] array2 = new int[m][n];

        for (int a = 0; a < n; a++) {
            for (int b = 0; b < m; b++) {
                array1[a][b] = scanner.nextInt();
            }
        }
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < m; y++) {
//                System.out.println("Y:" + y + " " + "X:" + x);
                array2[y][n - 1 - x] = array1[x][y];
            }
        }
        for (int p = 0; p < m; p++) {
            for (int q = 0; q < n; q++) {
              System.out.print(array2[p][q] +" ");
              if (q == n-1){
                System.out.println("");
              }


//                if (q == n-1) {
//                  System.out.print(array2[p][q] + " ");
//                    System.out.println("");
//                } else {
//                    System.out.print(array2[p][q] + " ");
//                }
            }
        }
    }
}