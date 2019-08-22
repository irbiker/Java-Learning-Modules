import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int outerCounter = 0;
    int mainCounter = 0;

    while(mainCounter < n) {
      outerCounter++;
      System.out.print(outerCounter + " ");
      mainCounter++;


      int innerCounter = 1;
      while (innerCounter < outerCounter && mainCounter < n) {
        System.out.print(outerCounter + " ");
        mainCounter++;
        innerCounter++;

      }
    }
  }
}
