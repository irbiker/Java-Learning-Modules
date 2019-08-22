import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int partNumbers = scanner.nextInt();
    int larger = 0;
    int smaller = 0;
    int perfect = 0;

    for (int i = 0; i < partNumbers; i++){
      int size = scanner.nextInt();
      if (size == 1){
        larger++;
      }else if (size == 0){
        perfect++;
      }else if (size == -1){
        smaller++;
      }
    }System.out.println(perfect + " " + larger + " " + smaller);
  }
}