package hexlet.code;

import hexlet.code.games.Calc;
import hexlet.code.games.Even;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player = new Player("Default-user");
        var resumeGame = true;
        while (resumeGame) {
            System.out.println("Please enter the game number and press Enter");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("3 - Calc");
            System.out.println("0 - exit");
            System.out.print("Your choose: ");
            Scanner scanner = new Scanner(System.in);

            var gameChoose = scanner.nextInt();
            switch (gameChoose) {
                case 1:
                    Cli.start(player);
                    break;
                case 2:
                    Even.start(player);
                    break;
                case 3:
                    Calc.start(player);
                    break;
                case 0:
                    resumeGame = false;
                    break;
                default:
                    System.out.println("Type in: 1,2,3 or 0(exit)");
                    break;
            }
            System.out.println();
        }
    }
}
