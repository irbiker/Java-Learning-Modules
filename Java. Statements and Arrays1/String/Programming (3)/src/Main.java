import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sequence = scanner.nextLine();
    char[] sequenceArray = sequence.toLowerCase().toCharArray();
    double sequenceLength = sequence.length();
    char[] guanine = {'g'};
    char[] cytosine = {'c'};
    int counter = 0;


    for (char i:sequenceArray){
      if (i == guanine[0] || i == cytosine[0]) {
        counter++;
      }
    }//System.out.println(counter);
    System.out.println((counter/sequenceLength)*100);
  }
}