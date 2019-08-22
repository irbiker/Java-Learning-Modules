import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String a = "You have chosen a ";
    String b = "There is no such shape!";
    String sq = "square";
    String ci = "circle";
    String tr = "triangle";
    String rh = "rhombus";
    int number = scanner.nextInt();

    switch (number) {
      case 1:
        System.out.println(a + sq);
        break;
      case 2:
        System.out.println(a + ci);
        break;
      case 3:
        System.out.println( a + tr);
        break;
      case 4:
        System.out.println(a + rh);
        break;
      default:
        System.out.println(b);

    }
  }
}