import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Queen 1
    int x1 = scanner.nextInt();
    int y1 = scanner.nextInt();

    //Queen 2
    int x2 = scanner.nextInt();
    int y2 = scanner.nextInt();

    //Printed Text
    String yes = "YES";
    String no = "NO";

    //Column and Row Logic with same location checking
    if ((x1 == x2 && y1 != y2) || (y1 == y2 && x1 != x2)) {
      System.out.println(yes);
    } else if (Math.abs(x1 - x2) == Math.abs(y1 - y2)) {
      System.out.println(yes);
    } else {
      System.out.println(no);

    }
  }
}