import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int low = scanner.nextInt();
    int high = scanner.nextInt();

    for (int i = low; i <= high; i++){
      if (i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");

      }else if (i % 5 == 0){
        System.out.println("Buzz");

      }else if (i % 3 == 0){
        System.out.println("Fizz");

      }else{
        System.out.println(i);

      }
    }
  }
}