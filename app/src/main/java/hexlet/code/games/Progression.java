package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Progression {
    public static void start(Player player) {
        final int lowerBound = 6;
        final int upperBound = 10;
        final int stepBound = 10;
        final int startNumberBound = 100;

        Engine engine = new Engine(player);
        System.out.println("What number is missing in the progression?");
        while (engine.getCorrectAnswerCounter() < engine.getGameRound()) {
            var lengthProgression = Util.getRandomWithBound(lowerBound,
                    upperBound);
            var hiddenSymbol = Util.getRandomWithBound(1,
                    lengthProgression - 2);
            var stepProgression = Util.getRandomPositiveInt(stepBound);
            var startStep = Util.getRandomPositiveInt(startNumberBound);
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
