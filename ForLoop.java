class ForLoop {
  public static void main(String[] args) {
  // Print a pyramid made from * symbols using a nested loop
    for (int i = 1; i <= 20; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("* ");
      }
      System.out.println();
    }
    
    System.out.println();

    // Print product table using a nested loop
    for (int number = 1; number <= 10; number++) {
      for (int multiplier = 1; multiplier <= number; multiplier++) {
        System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
      }
      System.out.println();
    }
    // Alternative to for of JS loop
    int [] numbers = {1, 2, 3, 4, 5};
  
    for (int num : numbers) {
    System.out.println(num);
    }

  }
  
}