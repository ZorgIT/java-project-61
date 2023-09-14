package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start() {
        System.out.println("Welcome to the Brain Games!");
        System.out.println("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNext()) {
            var username = scanner.next();
            System.out.println("Hello, " + username);
        } else {
            System.out.println("No input provided!");
        }
        System.exit(0);
    }
}
