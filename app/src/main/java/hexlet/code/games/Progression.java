package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Progression {
    public static void start(Player player) {
        Engine engine = new Engine(player);
        System.out.println("What number is missing in the progression?");
        while (engine.getCorrectAnswerCounter() < 3) {
            var lengthProgression = Util.getRandomWithBound(6, 10);
            var hiddenSymbol = Util.getRandomWithBound(1,
                    lengthProgression - 2);
            var stepProgression = Util.getRandomPositiveInt(10);
            var startStep = Util.getRandomPositiveInt(100);
            var curStep = startStep;
            var correctAnswer = "not set";
            var question = "";
            for (int i = 0; i < lengthProgression; i++) {
                if (i == hiddenSymbol) {
                    correctAnswer = String.valueOf(curStep);
                    question += ".. ";
                    curStep += stepProgression;
                    continue;
                }

                question += curStep + " ";
                curStep += stepProgression;
            }
            engine.showQuestion(question);
            var answer = engine.getAnswer();
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }

}
