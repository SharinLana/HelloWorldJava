class Operators {
  public static void main(String[] args) {
    int num1 = 12;
    int num2 = 6;
    double num3 = 12;
    int num4 = 5;
    int age = 17;

    // addition
    System.out.println(num1 + num2); // 18
    System.out.println(num4 += 7); // 12
    System.out.println(++num4); // 13

    // substraction
    System.out.println(num1 - num2); // 6
    System.out.println(num2 - num1); // -6
    System.out.println(num4 -= 1); // 12
    System.out.println(--num4); // 11

    // division
    System.out.println(num1 / num2); // 2
    System.out.println(num1 / num4); // 1 (it's acually 1.09 but here we are using int type and it's always rounded to
                                     // the left integer)
    System.out.println(num3 / num4); // 1.0909090909090908 (if one of the numbers is double, then the result will always be of the
                                     // type double)
    System.out.println(num3 /= 3); // 4.0

    // multiplication
    System.out.println(num1 * num2); // 72
    System.out.println(num4 *= 7); // 77

    // modulo
    System.out.println(num1 % num2); // 0

    // Comparison operators (output is true or false)
    System.out.println("==, <=, >= <, >, !=");

    if (age < 18 || age > 55) {
      System.out.println("Sorry, you are out of the age range");
    } else {
      System.out.println("Welcome!");
    }
  }
}