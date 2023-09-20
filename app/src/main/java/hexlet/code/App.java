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
        var resumeGame = true;
        //while (resumeGame) {
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
                case 4:
                    GCD.start(player);
                    break;
                case 5:
                    Progression.start(player);
                case 6:
                    Prime.start(player);
                case 0:
                    resumeGame = false;
                    break;
                default:
                    System.out.println("Type in: 1,2,3,4,5,6 or 0(exit)");
                    break;
            }
            System.out.println();
        //}
    }
}
