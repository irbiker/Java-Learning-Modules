import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String sequence = scanner.nextLine();
    int sequenceLength = sequence.length();
    char[] array = sequence.toCharArray();
    int counter = 1;


    for (int x = 1; x < sequenceLength; x++) {
      if (array[x] == array[x - 1]) {
        counter++;
      } else {
        System.out.print(array[x - 1] + "" + counter);
        counter = 1;
      }
    }System.out.print(array[sequenceLength - 1] + "" + counter);
  }
}



/*
System.out.print("A" + bigACounter);
bigACounter = 1;

System.out.print("B" + bigBCounter);
bigACounter = 1;


System.out.print("C" + bigCCounter);
bigACounter = 1;


System.out.print("a" + littleACounter);
bigACounter = 1;


System.out.print("b" + littleBCounter);
bigACounter = 1;


System.out.print("c" + littleCCounter);
bigACounter = 1;
 */








