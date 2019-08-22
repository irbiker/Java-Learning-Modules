import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int sum = 0;

    for ( ; a <= b; a++) {
      sum = a + sum;
    }
    System.out.println(sum);
  }
}
