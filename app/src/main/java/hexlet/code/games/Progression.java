package hexlet.code.games;

import hexlet.code.Engine;
import hexlet.code.Player;
import hexlet.code.Util;

public class Progression {
    public static void start(Player player) {
        Engine engine = new Engine(player);
        System.out.println("What number is missing in the progression?");
        while (engine.getCorrectAnswerCounter() < 3) {
            var lengthProgression = Util.getRandomWithBound(5, 10);
            var hiddenSymbol = Util.getRandomWithBound(0,
                    lengthProgression - 1);
            var stepProgression = Util.getRandomPositiveInt(10);
            var startStep = Util.getRandomPositiveInt(100);
            var curStep = startStep;
            var correctAnswer = "not set";
            for (int i = 0; i < lengthProgression; i++) {
                if (i == hiddenSymbol) {
                    correctAnswer = String.valueOf(curStep);
                    System.out.print(".. ");
                    curStep += stepProgression;
                    continue;
                }
                System.out.print(curStep + " ");
                curStep += stepProgression;
            }
            System.out.print("\n");
            var answer = engine.getAnswer();
            engine.checkResult(player, answer, correctAnswer);
        }
        System.out.println("Congratulations, " + player.getName() + "!");
    }

}
