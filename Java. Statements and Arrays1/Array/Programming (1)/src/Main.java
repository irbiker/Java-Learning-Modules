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
    int largestSoFar = array[0];
    int index = 0;
    //System.out.println("Array: "+Arrays.toString(array));

    for (int x = 0; x < array.length; x++) {
      if(array[x] > largestSoFar){
        index = x;
        //System.out.println("Counter: "+index);
        largestSoFar = array[x];
        //System.out.println("Comparative Value: "+largestSoFar);
      }
    }System.out.println(index);
  }
}