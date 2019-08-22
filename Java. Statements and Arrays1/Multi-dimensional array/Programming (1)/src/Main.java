import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
  Scanner scanner = new Scanner(System.in);
  int n = scanner.nextInt();
  int m = scanner.nextInt();

  int highestValueN=0;
  int highestValueM=0;
  //int highestElementValue = -1;

  int[][] array = new int[n][m];

  for (int a = 0; a < n; a++){
    for (int b = 0; b < m; b++){
      array[a][b] = scanner.nextInt();
    }
  }
    int highestElementValue = array[0][0];
  for (int x = 0; x < n; x++) {
    for (int y = 0; y < m; y++) {
      if (array[x][y] > highestElementValue) {
        //System.out.println(array[x][y]);
        highestElementValue = array[x][y];
        highestValueN = x;
        highestValueM = y;
        //System.out.println("Highest Value N: "+highestValueN);
        //System.out.println("Highest Value M: "+highestValueM);
      }
    }
  }
    System.out.println(highestValueN +" " +highestValueM);
    }
    }