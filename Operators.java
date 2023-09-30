class Operators {
  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 6;
    double num3 = 12;
    int num4 = 5;

    // addition
    System.out.println(num1 + num2); // 18
    System.out.println(num4 += 7); // 12

    // substraction
    System.out.println(num1 - num2); // 6
    System.out.println(num2 - num1); // -6
    System.out.println(num4 -= 1); // 4

    // division
    System.out.println(num1 / num2); // 2
    System.out.println(num1 / num4); // 2 (it's acually 2.4 but here we are using int type and it's always rounded to
                                     // the left integer)
    System.out.println(num3 / num4); // 2.4 (if one of the numbers is double, then the result will always be of the type double)
    System.out.println(num3 /= 3); // 4.0
    
    // multiplication
    System.out.println(num1 * num2); // 72
    System.out.println(num4 *= 7); // 35

    // modulo
    System.out.println(num1 % num2); // 0

    // Comparison operators (output is true or false)
    System.out.println("==, <=, >= <, >, !=");
  }
}