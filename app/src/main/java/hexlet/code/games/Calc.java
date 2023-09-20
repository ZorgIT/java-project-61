package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Calc {
    public static void start(Player player) {
        final int numBound1 = 5;
        final int numBound2 = 30;
        final int operatorCount =  3;
        final int switchCase2 = 2;
        final int switchCase3 = 3;

        Engine engine = new Engine(player);
        System.out.println("What is the result of the expression?");

        while (engine.getCorrectAnswerCounter() < engine.getGameRound()) {
            String question = null;
            var num1 = Util.getRandomPositiveInt(numBound1);
            var num2 = Util.getRandomPositiveInt(numBound2);
            var operator = Util.getRandomPositiveInt(operatorCount);
            var correctAnswer = 0;
            switch (operator) {
                case switchCase2:
                    question = num1 + " - " + num2;
                    correctAnswer = num1 - num2;
                    break;
                case switchCase3:
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
