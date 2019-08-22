import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    //Output Strings
    String a = "Normal";
    String b = "Deficiency";
    String c = "Excess";
    //Requirements
    int recommended = scanner.nextInt();
    int oversleeping = scanner.nextInt();

    //Ann's Hours
    int annsHours = scanner.nextInt();

    if (annsHours < recommended) {
      System.out.println(b);
    }else if (annsHours > oversleeping) {
      System.out.println(c);
    }else {
      System.out.println(a);
    }
  }
}