package hexlet.code;

import java.util.Random;
import java.util.Scanner;

public class Even {
    public static void  start(Player player) {
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'." + "\n");

        var counter = 0;
        while (counter < 3) {
            var questionNum = getRandomPositiveInt(20);
            System.out.println("Question:" + questionNum);
            System.out.println("Your answer: ");
            Scanner scanner = new Scanner(System.in);
            var answer = scanner.nextLine();
            var correctAnswer = questionNum % 2 == 0 ? "yes" : "no";

            if (answer.toLowerCase().equals(correctAnswer)) {
                System.out.println("Correct!" + "\n");
                counter++;
            } else {
                System.out.println("`" + answer + "` is wrong answer ;(. "
                        + "Correct answer was `" + correctAnswer + "`");
                System.out.println("Let's try again, " + player.getName()
                        + "!" + "\n");
                counter = 0;
            }
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }

    public static int getRandomPositiveInt(int upperBound) {
        Random random = new Random();
        var randomNumber = random.nextInt(upperBound) + 1;
        return randomNumber;
    }
}
