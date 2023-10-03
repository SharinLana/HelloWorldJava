import java.util.Scanner;

// Switch-Case is faster than If statement in Java
class SwitchStatement {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the first number \n");
    int num1 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("Enter the second number \n");
    int num2 = scanner.nextInt();
    scanner.nextLine();

    System.out.print("What operation would you like to perform? \n");
    String operation = scanner.nextLine();

    switch (operation) {
      case "sum":
        System.out.printf("%d + %d = %d", num1, num2, num1 + num2);
        break;
      case "div":
        System.out.printf("%d / %d = %d", num1, num2, num1 / num2);
        break;
      case "mult": 
        System.out.printf("%d * %d = %d", num1, num2, num1 * num2);
        break;
      case "sub":
        System.out.printf("%d - %d = %d", num1, num2, num1 - num2);
        break;
      case "remainder":
        System.out.printf("%d modulo %d = %d", num1, num2, num1 % num2);
        break;
      default:
        System.out.printf("%s operation is not supported", operation);
    }

    scanner.close();
    
  }
}