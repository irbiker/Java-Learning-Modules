import java.util.Arrays;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int len = scanner.nextInt();
    int[] array = new int[len];

    for(int i = 0; i < array.length; i++){
      array[i] = scanner.nextInt();
    }
    Arrays.sort(array);
    //System.out.println("Sorted array: "+Arrays.toString(array));
    int largestPairwise = 0;

    if (array.length > 1){
    for(int x = 0; x < array.length; x++) {
      for (int y = 0; y < (array.length - 1); y++) {
        if (array[y] * array[y + 1] > largestPairwise) {
          largestPairwise = (array[y] * array[y + 1]);
          //System.out.println(largestPairwise);
            }
          }
        }System.out.println(largestPairwise);
      }else{
      System.out.println(array[0]);
    }

  }
}