import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    if (a <= 0){
      System.out.println("NO");
    }else{
      System.out.println("YES");
    }
  }
}