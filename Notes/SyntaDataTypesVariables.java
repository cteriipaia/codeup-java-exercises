public class SyntaDataTypesVariables {
    public static void main(String[] args) {
        System.out.println("This is an example of a statement");
        System.out.println("Notice it ends with a semicolon");
        System.out.println("When we create a statement: they must end with a semicolon");
        System.out.println("Or Java will get mad at us..."); //this is a single line comment
/*        This is a multi-line comment
*            it can be as long as we want
* Aint it neat?
*/
        byte smallNumber = 19;
        System.out.println(smallNumber);
        smallNumber = 127;
        int notAsSmallNumber = smallNumber;
        smallNumber++;
        notAsSmallNumber++;
        System.out.println(smallNumber);
        System.out.println(notAsSmallNumber);

//        int numDefault;
//        System.out.println("numDefault = " + numDefault);

        char firstLetter = 'C';

        String message = "This is a string";
        String quote = "\t\" Better out then in, I always say.\" - Shrek, but also Joe Stephens?!";
        System.out.println(message);
        System.out.println(quote);

    }
}
