import java.util.Scanner;

class UserInput {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // System.in = input from a command line / console
    System.out.println("Type in your name. \n");
    String name = scanner.nextLine();

    System.out.println("Your name is " + name); // Your name is Lana Sharin
    System.out.printf("Hello %s! How old are you? \n", name); // Hello Svetlana Sharina! How are you?
    
    int age = scanner.nextInt(); 
    scanner.nextLine(); // this must be put after every non-nextLine() method (nextInt, nextDouble, nextBoolean, etc) to clean input buffer
    
    System.out.printf("%d is an excellent age to start to learn programming! What language do you prefer? \n", age);
    // Other possible methods of scanner:
    // nextDouble();
    // nextChar();
    // nextBoolean();
    // nextFloat();
    // nextShort(); 
    // etc (all possible types in Java)

    String language = scanner.nextLine();
    System.out.printf("Good choice! %s is in demand right now. How much do you want to earn annually? \n", language);

    int salary = Integer.parseInt(scanner.nextLine()); // will parse integer into a string
    // can also be parseDouble(), paseFloat(), etc
    System.out.printf("$ %s is a good start! \n", salary);
    
    
    scanner.close(); // a mandatory to prevent a memory leak
  }
}