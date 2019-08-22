import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    int year = scanner.nextInt();
    String a = "Leap";
    String b = "Regular";

    if ((year%4 == 0) && (year%100 != 0) || (year%400 == 0)) {
     System.out.println(a);
    }else {
      System.out.println(b);
    }
  }
}