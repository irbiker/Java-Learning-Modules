import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int numberOfInts = scanner.nextInt();
    //int nextNumber = scanner.nextInt();
    int sum = 0;

    for (int counter = 1; counter <= numberOfInts; counter++) {
      int nextNumber = scanner.nextInt();
      if (nextNumber % 6 == 0) {
        sum = nextNumber + sum;



      }
    }System.out.println(sum);
  }
}
