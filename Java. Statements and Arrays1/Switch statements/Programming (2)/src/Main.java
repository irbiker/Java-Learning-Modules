import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    long a = scanner.nextLong();
    String c = scanner.next();
    long b = scanner.nextLong();


    switch (c) {
      case "+":
        System.out.println(a + b);
        break;
      case "-":
        System.out.println((a - b));
        break;
      case "/":
        if (b == 0) {
          System.out.println("Division by 0!");
        }else {
          System.out.println((a / b));
        }
        break;
      case "*":
        System.out.println((a * b));
        break;
      default:
        System.out.println("Unknown operator");
    }
  }
}