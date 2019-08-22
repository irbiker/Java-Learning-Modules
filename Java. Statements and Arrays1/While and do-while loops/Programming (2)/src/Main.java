import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int currentNumber;
    int total = 0;

    do {

      currentNumber = scanner.nextInt();
      total += currentNumber;

    } while (currentNumber != 0);


  System.out.println(total);


  }
}