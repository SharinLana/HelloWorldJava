import java.util.Scanner;

class IfStatement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the first number: \n");
    double num1 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("Enter the second number: \n");
    double num2 = scanner.nextDouble();
    scanner.nextLine();

    System.out.print("What operation would you like to perform? \n");
    String operation = scanner.nextLine();
    
    if (operation.equals("sum")) {
      System.out.printf("%f + %f = %f", num1, num2, num1 + num2);
    } else if (operation.equals("sub")) {
      System.out.printf("%f - %f = %f", num1, num2, num1 - num2);
    } else {
      System.out.println("Sorry, this operation is not supported");
    }
    
    scanner.close();
  }
}