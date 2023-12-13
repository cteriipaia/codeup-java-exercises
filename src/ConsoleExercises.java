import java.util.Scanner;
public class   ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();

        System.out.printf("You entered: %d%n", userInput);

        System.out.print("Enter three words: ");
        String firstWord = scanner.next();
        String secondWord = scanner.next();
        String thirdWord = scanner.next();

        System.out.printf("You entered: %s, %s, %s%n", firstWord, secondWord, thirdWord);
        scanner.nextLine();

        System.out.print("Enter a sentence: ");
        String userSentence = scanner.nextLine();

        System.out.printf("You entered: %s%n", userSentence);
        System.out.print("Enter the length and width of the classroom: ");

        String length = scanner.nextLine();
        String width = scanner.nextLine();
        double area = Double.parseDouble(length) * Double.parseDouble(width);
        double perimeter = (Double.parseDouble(length) * 2) + (Double.parseDouble(width) * 2);
        System.out.printf("The area of the classroom is: %.2f%n", area);
        System.out.printf("The perimeter of the classroom is: %.2f%n", perimeter);
    }
}
