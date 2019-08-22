import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int natNumber = scanner.nextInt();
    int revisedNatNumber = 0;
    System.out.print(natNumber + " ");

    while (natNumber > 1) {
      if (natNumber % 2 == 0) {
       revisedNatNumber = natNumber / 2;
       System.out.print(revisedNatNumber + " ");
       natNumber = revisedNatNumber;
      }else {
        revisedNatNumber = (natNumber * 3) + 1;
        System.out.print(revisedNatNumber + " ");
        natNumber = revisedNatNumber;

      }
    }

  }
}