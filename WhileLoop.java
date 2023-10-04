class WhileLoop {
  public static void main(String[] args) {
    // Print a product table for number 5
    int number = 5;
    int multiplier = 1;

    while (multiplier <= 10) {
      System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
      multiplier++;
    }

    // Do while - same task
    do {
      System.out.printf("%d * %d = %d \n", number, multiplier, number * multiplier);
      multiplier++;
      
    } while(multiplier <= 10);
  }
}