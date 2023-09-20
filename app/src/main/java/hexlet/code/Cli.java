package hexlet.code;

import java.util.Scanner;

public class Cli {
    public static void start(Player player) {
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        Scanner scanner = new Scanner(System.in);
        if (scanner.hasNextLine()) {
            player.setName(scanner.nextLine());
            System.out.println("Hello, " + player.getName() + "!");
        } else {
            System.out.println("No input provided!");
        }
    }
}
