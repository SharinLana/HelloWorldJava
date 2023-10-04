import java.util.Arrays;

class ArraysExplanation {
  public static void main(String[] args) {
    char[] vowels = { 'e', 'o', 'i', 'u', 'a' };
    System.out.println(Arrays.toString(vowels) ); // [a, e, i, o, u] (and starts with a new line)
    System.out.print(vowels); // aeiou> (doesn't start with a new line)
    System.out.println("\n");
    
    vowels[2] = 'x';
    System.out.println(Arrays.toString(vowels)); // [a, e, x, o, u]
    System.out.println(vowels.length); // 5

    int [] numbers = new int[5];
    numbers[0] = 1;
    numbers[1] = 2;
    numbers[2] = 3;
    System.out.println(Arrays.toString(numbers)); // [1, 2, 3, 0, 0] + slways starts with a new line
    System.out.println(numbers); // [I@31befd9f (address in memory)
    System.out.println(numbers[0]); // 1 and doesn't start with a new line

    char key = 'e';

    // COMMON ARRAY METHODS
    Arrays.sort(vowels, 1, 4); // [e, o, u, x, a] sorts only elements staring from idx 1 to idx 3 (the elem under idx 4 is not included)
    Arrays.sort(vowels); // [a, e, o, u, x] sorts all the elements
    System.out.println(Arrays.toString(vowels)); 
    
   int itemIndex = Arrays.binarySearch(vowels, key); // key in Java == element of the array in JS; binarySearch() can be applied only on sorted arrays
    int itemIndexOnALineSegment = Arrays.binarySearch(vowels, 2, 4, key); // binarySearch() can be implemented on the specific line segment
    System.out.println(itemIndex); // 1 (the key "e" is found under the index 1)
    System.out.println(itemIndexOnALineSegment); // -3 (negative output means the search has failed)

    Arrays.fill(vowels, 1, 4, 'w'); // fills the array with "w" on a pointed line segment (replacing the old keys) 
    System.out.println(vowels); // awwwx
    System.out.println(Arrays.toString(vowels)); // [a, w, w, w, x]

    // ALIASES OF ARRAYS
    // If you try to make a copy of the array by implementing the following steps, you'll fail:
    // only a reference to the original array will be created, not exactly the new separate array:
    int [] originalArr = {1, 2, 3, 4, 5};
    int [] copyOfOriginalArr = originalArr;

    // copyOfOriginalArr is NOT a copy! It's a reference to the address of the original array in memory
    // So if you change the copy, the original array also will be changed
    Arrays.fill(copyOfOriginalArr, 0); // filled the "copy" with zeroes. 
    // If the copyOfOriginalArr is a TRUE copy, the originalArray should not be changed. 
    System.out.println(Arrays.toString(copyOfOriginalArr)); // [0, 0, 0, 0, 0]
    System.out.println(Arrays.toString(originalArr)); // [0, 0, 0, 0, 0] But it did change

    // MAKING AN ACTUAL COPY OF THE ARRAY
    int [] trueCopy = Arrays.copyOf(originalArr, originalArr.length); // will copy the entire array
    // The addresses of the arrays in memory after copying will be different
    System.out.println(originalArr); // address [I@1fb3ebeb
    System.out.println(trueCopy); // address [I@548c4f57

    // To compare the content of the oridinal array and its copy:
    System.out.println(Arrays.equals(originalArr, trueCopy)); // true
    
    Arrays.fill(trueCopy, 5);
    System.out.println(Arrays.toString(trueCopy)); // [5, 5, 5, 5, 5]
    System.out.println(Arrays.toString(originalArr)); // [0, 0, 0, 0, 0]

    // You can change the length of the copied array
    int [] trueCopyCustomLength = Arrays.copyOf(originalArr, 2); // will copy 2 first keys
    int [] trueCopyCustomRange = Arrays.copyOfRange(originalArr, 1, 2); // will copy originalArr keys 
    // under the indices 1 and 2 (3 will not be included)
    int [] trueCopyCustomRangeIncreasedLength = Arrays.copyOfRange(originalArr, 1, 12); // will copy an original array starting from the index 1 and adding 0 for the keys that don't exist in the original array (there will be 11 elements in total)

    System.out.println(Arrays.toString(trueCopyCustomLength)); // [0, 0]
    System.out.println(Arrays.toString(trueCopyCustomRange)); // [0]
    System.out.println(Arrays.toString(trueCopyCustomRangeIncreasedLength)); // [0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0]
    
    
  }
}