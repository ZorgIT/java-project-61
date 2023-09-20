package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

import java.util.Arrays;

public class Prime {
    public static void  start(Player player) {
        final int numbersUpperBound = 200;
        final int[] simpleNumbers = {2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31,
            37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101,
            103, 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,
            163, 167, 173, 179, 181, 191, 193, 197, 199};
        Engine engine = new Engine(player);
        System.out.println("Answer 'yes' if given number is prime. "
                + "Otherwise answer 'no'." + "\n");

        while (engine.getCorrectAnswerCounter() < engine.getGameRound()) {
            var questionNum = Util.getRandomPositiveInt(numbersUpperBound);
            engine.showQuestion(String.valueOf(questionNum));
            var answer = engine.getAnswer();
            var correctAnswer =
                    (Arrays.binarySearch(simpleNumbers, questionNum) > -1)
                            ? "yes" : "no";
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }

}
