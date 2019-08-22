import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String shape = scanner.next();

    switch (shape) {
      case "triangle":
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double variableOfTriangle = (side1 + side2 + side3)/2;
        System.out.println(Math.sqrt(variableOfTriangle * (variableOfTriangle - side1) * (variableOfTriangle - side2) * (variableOfTriangle - side3)));
        break;
      case "rectangle":
        double sideA = scanner.nextDouble();
        double sideB = scanner.nextDouble();
        System.out.println(sideA * sideB);
        break;
      case "circle":
        double radius = scanner.nextDouble();
        System.out.println(3.14 * (radius * radius));
        break;
    }
  }
}
