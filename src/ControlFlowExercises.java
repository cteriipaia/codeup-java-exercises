public class ControlFlowExercises {
    public static void main(String[] args) {
        // While
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }

        // Do While
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);

        long l = 2;
        do {
            System.out.println(l);
            l *= l;
        } while (l < 1000000);

        // For
        for (int m = 5; m <= 15; m++) {
            System.out.print(m + " ");
        }

        for (int n = 0; n <= 100; n += 2) {
            System.out.println(n);
        }

        for (int o = 100; o >= -10; o -= 5) {
            System.out.println(o);
        }

        for (long p = 2; p < 1000000; p *= p) {
            System.out.println(p);
        }

        // FizzBuzz
        for (int q = 1; q <= 100; q++) {
            if (q % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (q % 5 == 0) {
                System.out.println("Buzz");
            } else if (q % 3 == 0) {
                System.out.println("Fizz");
            } else {
                System.out.println(q);
            }
        }

        // Table of Powers
        System.out.println("What number would you like to go up to?");
        int userInt = 10;
        System.out.println("Here is your table!");
        System.out.println("number | squared | cubed");
        System.out.println("------ | ------- | -----");
        for (int r = 1; r <= userInt; r++) {
            System.out.printf("%-6d | %-7d | %-5d%n", r, r * r, r * r * r);
        }

        // Convert given number grades into letter grades
        System.out.println("Enter a numerical grade from 0 to 100.");
        int userGrade = 80;
        System.out.println("Your letter grade is: ");

        if (userGrade >= 88) {
            System.out.println("A");
        } else if (userGrade >= 80) {
            System.out.println("B");
        } else if (userGrade >= 67) {
            System.out.println("C");
        } else if (userGrade >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }

    }
}
