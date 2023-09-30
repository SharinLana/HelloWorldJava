class Types {
  public static void main(String[] args) {
    // integer types
    byte singleByte = 100; // -128 to 127
    short smallNumber = 20000; // -32.768 to 32.767
    int integer = 2147483647; // -2147483638 to 2147483637
    long largeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807L

    // decimal types
    double aDouble = 1.79769313; // 4.9E-324 to 1.7976931348623157E308
    float aFloat = 3.4028F; // 1.4E-45 to 3.4028235E38 (need to add F at the end because by default this number will be treated as an int)

    // booleans
    boolean isWeekend = true;
    boolean isWorkday = false;

    // characters
    char copyrightSymbol = '\u00A9';
    System.out.println("This is the copyright symbol: " + copyrightSymbol);

    // type conversion: in to double (will work)
    int number1 = 15;
    double number2 = number1;
    System.out.println(number2); // 15.0

    // type conversion: double to int (will cut the fraction after .)
    double number3 = 15.12;
    int number4 = (int)number3;
    System.out.println(number4); // 15
    
  }
}