import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    double low = scanner.nextInt();
    double high = scanner.nextInt();
    double sum = 0;
    double counter = 0;


    for (; low <= high; low++) {
      if (low % 3 ==0) {
        counter++;
        sum += low;

      }
    }System.out.println( sum / counter);

  }
}