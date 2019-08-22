import java.util.Scanner;
import java.util.Arrays;

class Task {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String sampleInput = scanner.next();
    //System.out.println("Sample Input = "+sampleInput);

    String firstHalf = sampleInput.substring(0, 3);
    //System.out.println("First Half Substring = "+firstHalf);
    String secondHalf = sampleInput.substring(3, 6);
    //System.out.println("Second Half Substring = "+secondHalf);

    int sum1 = 0;
    int sum2 = 0;

    for (int x = 0; x<sampleInput.length()/2; x++){
      sum1 += firstHalf.charAt(x);
      //System.out.println("Sum1 = "+ sum1);
      sum2 += secondHalf.charAt(x);
      //System.out.println("Sum2 = "+ sum2);

    }
    if (sum1 == sum2){
      System.out.println("Lucky");
    }else{
      System.out.println("Regular");
    }




  }
}
