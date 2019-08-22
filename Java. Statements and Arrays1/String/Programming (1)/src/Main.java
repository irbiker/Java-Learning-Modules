
import java.util.Scanner;


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    String inputText = scanner.nextLine();
    //System.out.println(inputText);
    String[] inputTextArray = inputText.split(" ");
    //System.out.println(Arrays.toString(inputTextArray));

    int longestElement = 0;
    int longestElementPosition=0;

    for (int x = 0; x < inputTextArray.length; x++){
      //System.out.println( "Array Element Length: "+inputTextArray[x].length()+ " ");
      if (inputTextArray[x].length() >  longestElement){
        longestElement = inputTextArray[x].length();
        longestElementPosition = x;
        //System.out.println("Longest Element: "+longestElement);
        //System.out.println("Longest Element Position: "+longestElementPosition);
      }
    }System.out.println(inputTextArray[longestElementPosition]);
  }
}