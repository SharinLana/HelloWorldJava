class Strings {
  public static void main(String[] args) {
    String literalString1 = "abc";
    String literalString2 = "abc";

    String objectString1 = new String("xyz");
    String objectString2 = new String("xyz");
    String objectString3 = new String("XYZ");

    System.out.println(literalString1 == literalString2); // true
    System.out.println(objectString1 == objectString2); // false (object != object)
    // BUT you can compare object strings values using equals() method:
    System.out.println(objectString1.equals(objectString2)); // true
    System.out.println(objectString1.equalsIgnoreCase(objectString3)); // true
    

    // Concatenation
    char singleCharacter = '$';
    String fullName = "Lana Sharin";
    String changedName = fullName.replace("Lana Sharin", "Svetlana Sharina");
    String country = "United States";
    int age = 36;
    double gpa = 4.6;
    String formattedString = String.format(
        "Hi, my name is %s and I'm from %s. I'm %d years old. My GPA is %f. I won %c1", fullName, country,
        age, gpa, singleCharacter);
    // &s - strings
    // %d - integers, shorts and longs
    // %f - floats, doubles
    // %b - booleans
    // %c - characters

    System.out.println("Hi, my name is " + fullName + " and I'm from " + country + ". I'm " + age + " years old.");
    // or
    System.out.println(formattedString); 

    // Java String Built-in Methods
    System.out.println(fullName.length()); // 11
    System.out.println(fullName.isEmpty()); // false
    System.out.println(fullName.toUpperCase()); // LANA SHARIN
    System.out.println(fullName.toLowerCase()); // lana sharin
    System.out.println(fullName.replace("Lana Sharin", "Svetlana Sharina")); // Svetlana Sharina. 
    // The return() method returns a NEW string (the old one remains untouched, so it's better to save the result in a new variable and then print it out:
    System.out.println(changedName); // Svetlana Sharina
    System.out.println(fullName.contains("Lola")); // false
  }
}