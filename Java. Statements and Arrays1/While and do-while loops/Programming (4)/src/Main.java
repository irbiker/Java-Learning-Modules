import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    long M = scanner.nextLong();
    long counter = 0;
    long total = 1;

    while (total <= M) {
      counter++;
      total = counter * total;


    }System.out.println(counter);


  }
}