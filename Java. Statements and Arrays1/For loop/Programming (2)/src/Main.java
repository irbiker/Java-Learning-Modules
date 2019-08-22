import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int nextInput;
    int highestValue = 0;

    for (int i = 1; i <= n; i++){
      nextInput = scanner.nextInt();
      if (nextInput % 4 == 0 && nextInput > highestValue){

        highestValue = nextInput;

      }
    }System.out.println(highestValue);
  }
}