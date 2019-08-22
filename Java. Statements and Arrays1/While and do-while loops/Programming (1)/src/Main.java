import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int numberOfElements = scanner.nextInt();
    int currentNumberCount = 0;
    int largestValueSoFar = 0;

    while (currentNumberCount < numberOfElements){
      int currentValue = scanner.nextInt();
      if (currentValue % 4 == 0 && currentValue > largestValueSoFar) {
        largestValueSoFar = currentValue;
      }
      currentNumberCount++;
    }
    System.out.println(largestValueSoFar);
  }
}