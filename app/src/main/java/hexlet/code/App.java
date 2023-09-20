package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;
import hexlet.code.games.GCD;
import hexlet.code.games.Progression;
import hexlet.code.games.Prime;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player = new Player("Default-user");
        System.out.println("Please enter the game number and press Enter");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - exit");
        System.out.print("Your choose: ");
        Scanner scanner = new Scanner(System.in);

        var gameChoose = scanner.next();
        switch (gameChoose) {
            case "1":
                Cli.start(player);
                break;
            case "2":
                Even.start(player);
                break;
            case "3":
                Calc.start(player);
                break;
            case "4":
                GCD.start(player);
                break;
            case "5":
                Progression.start(player);
                break;
            case "6":
                Prime.start(player);
                break;
            case "0":
                break;
            default:
                System.out.println("Type in: 1,2,3,4,5,6 or 0(exit)");
                break;
        }
    }
}
