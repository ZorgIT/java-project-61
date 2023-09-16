package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Player player = new Player("Default-user");
        var resumeGame = true;
        while (resumeGame) {
            System.out.println("Please enter the game number and press Enter");
            System.out.println("1 - Greet");
            System.out.println("2 - Even");
            System.out.println("0 - exit");
            System.out.print("Your choose: ");
            Scanner scanner = new Scanner(System.in);

            var gameChoose = scanner.nextInt();
            switch (gameChoose) {
                case 1:
                    Cli.start(player);
                    break;
                case 2:
                    Cli.start(player); //добавить проверку на наличие имени.
                    Even.start(player);
                case 0:
                    resumeGame = false;
                    break;
                default:
                    System.out.println("Choose one of them: 1,0");
                    break;
            }
            System.out.println();
        }
    }
}
