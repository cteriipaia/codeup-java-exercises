public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

    int myFavoriteNumber = 7;
    System.out.println(myFavoriteNumber);

    String myString = "This is a string";
//  myString = 'A'; // This will result in a compilation error because single quotes are used for characters, not strings.
//  myString = "3.14159"; // This is valid. The value is assigned as a string.
    System.out.println(myString);

    float myNumber =
    myNumber = 3.14F; // This will result in a compilation error because 3.14 is a double, and you are trying to assign it to a float without explicit casting.

//  myNumber = 123L; // This is valid. The value 123L is a long.

//  myNumber = 123; // This is valid. The integer value 123 is within the range of long values.

    System.out.println(myNumber); // This will result in a compilation error because `myNumber` is not initialized.

//  myNumber = 3.14; // This will result in a compilation error because 3.14 is a double, and you are trying to assign it to a long without explicit casting.


//   int x = 5;
//   System.out.println(x++); // Outputs 5 (post-increment)
//   System.out.println(++x);
//   System.out.println(x);   // Outputs 6

    int classicNumber = 5;

//   String theNumberThree = "three";
//   Object o = theNumberThree;
//   int three = (int) o; // This will result in a class cast exception because you cannot cast a String to an Integer.

//   int three = (int) "three"; // This will result in a compilation error because you cannot cast a String to an Integer.

//    int x = 4;
//    x += 5;
//    System.out.println(x);

//    int x = 3;
//    int y = 4;
//    y *= x;

//    int x = 10;     // This will result in a compilation error
//    int y = 2;      // This will result in a compilation error
//    x /= y;         // This will result in a compilation error
//    y -= x;         // This will result in a compilation error

//    System.out.println(x);
//    System.out.println(y);

int bigNumber = Integer.MAX_VALUE + 1;
System.out.println(bigNumber);

    }
}
