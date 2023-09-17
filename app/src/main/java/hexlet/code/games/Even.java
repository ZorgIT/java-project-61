package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Even {
    public static void  start(Player player) {
        Engine engine = new Engine(player);
        System.out.println("Answer 'yes' if the number is even, otherwise "
                + "answer 'no'." + "\n");
        while (engine.getCorrectAnswerCounter() < 3) {
            var questionNum = Util.getRandomPositiveInt(20);
            engine.showQuestion(String.valueOf(questionNum));
            var answer = engine.getAnswer();
            var correctAnswer = questionNum % 2 == 0 ? "yes" : "no";
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }
}
