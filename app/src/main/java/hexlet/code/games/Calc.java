package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Calc {
    public static void start(Player player) {
        Engine engine = new Engine(player);
        System.out.println("What is the result of the expression?");

        while (engine.getCorrectAnswerCounter() < 3) {
            String question = null;
            var num1 = Util.getRandomPositiveInt(5);
            var num2 = Util.getRandomPositiveInt(30);
            var operator = Util.getRandomPositiveInt(3);
            var correctAnswer = 0;
            switch (operator) {
                case 2:
                    question = num1 + " - " + num2;
                    correctAnswer = num1 - num2;
                    break;
                case 3:
                    question = num1 + " * " + num2;
                    correctAnswer = num1 * num2;
                    break;
                default:
                    question = num1 + " + " + num2;
                    correctAnswer = num1 + num2;
                    break;
            }
            engine.showQuestion(question);
            var answer = engine.getAnswer();
            engine.checkResult(player, answer, String.valueOf(correctAnswer));
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}
