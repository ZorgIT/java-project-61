package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class GCD {
    public static void  start(Player player) {
        Engine engine = new Engine(player);
        System.out.println("Find the greatest common divisor of given numbers.");
        while (engine.getCorrectAnswerCounter() < 3) {
            var num1 = Util.getRandomPositiveInt(100);
            var num2 = Util.getRandomPositiveInt(100);
            engine.showQuestion(num1 + " " + num2);
            var answer = engine.getAnswer();
            var correctAnswer = String.valueOf(Util.getGCD(num1, num2));
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}
