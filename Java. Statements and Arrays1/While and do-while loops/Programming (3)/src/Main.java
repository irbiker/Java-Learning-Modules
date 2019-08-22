import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int N = scanner.nextInt();
    int counter = 1;
    int a=0;

    while (Math.pow(counter, 2) <= N) {
      a = (int)Math.pow(counter, 2);
      System.out.println(a);
      counter++;
    }

  }
}