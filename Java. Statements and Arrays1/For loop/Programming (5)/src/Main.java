import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int totalInput = scanner.nextInt();

        int dGrade = 0;
        int cGrade = 0;
        int bGrade = 0;
        int aGrade = 0;

        for (int counter = 1; counter <= totalInput; counter++){
            int currentValue = scanner.nextInt();

            if (currentValue == 5) {

                aGrade++;

            }else if (currentValue == 4){
                bGrade++;
            }else if ( currentValue == 3){
                cGrade++;
            }else if ( currentValue == 2){
                dGrade++;
                }
            }System.out.print(dGrade +" "+ cGrade +" "+ bGrade +" "+ aGrade);
        }
    }