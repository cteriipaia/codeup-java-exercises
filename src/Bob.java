import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Start a conversation with Bob (type 'exit' to end):");

        String input;
        do {
            System.out.print("You: ");
            input = scanner.nextLine();
            bobRespond(input);
        } while (!input.equalsIgnoreCase("exit"));
    }

    private static void bobRespond(String input) {
        if (input.endsWith("?")) {
            System.out.println("Bob: Sure.");
        } else if (input.endsWith("!")) {
            System.out.println("Bob: Whoa, chill out!");
        } else if (input.trim().isEmpty()) {
            System.out.println("Bob: Fine. Be that way!");
        } else {
            System.out.println("Bob: Whatever.");
        }
    }
}

