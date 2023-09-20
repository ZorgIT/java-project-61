package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class GCD {
    public static void  start(Player player) {
        final int questionNumBound1 = 100;
        final int questionNumBound2 = 100;

        Engine engine = new Engine(player);
        System.out.println("Find the greatest common divisor of given numbers.");
        while (engine.getCorrectAnswerCounter() < engine.getGameRound()) {
            var num1 = Util.getRandomPositiveInt(questionNumBound1);
            var num2 = Util.getRandomPositiveInt(questionNumBound2);
            engine.showQuestion(num1 + " " + num2);
            var answer = engine.getAnswer();
            var correctAnswer = String.valueOf(Util.getGCD(num1, num2));
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}
