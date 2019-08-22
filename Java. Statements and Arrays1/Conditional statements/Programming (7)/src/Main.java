import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Length
        int n = scanner.nextInt();
        //width
        int m = scanner.nextInt();
        //Segments
        int k = scanner.nextInt();

        //output
        String yes = "YES";
        String no = "NO";


        if (((k%n == 0 || k%m == 0)) && (k <= (n*m))){
            System.out.println(yes);
        }else {
            System.out.println(no);
        }
    }
}