import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int number = scanner.nextInt();
    int b = (number / 100);
    int c = (number % 100);
    int q1 = (b / 10);
    int r1 = (b % 10);
    int q2 = (c / 10);
    int r2 = (c % 10);

    if (r1 == q2 && q1 == r2){
      System.out.println("1");
    }else{
      System.out.println("2");
    }
  }
}