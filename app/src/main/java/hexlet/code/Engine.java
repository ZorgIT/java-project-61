package hexlet.code;

import java.util.Scanner;

public class Engine {
    private int correctAnswerCounter;

    public Engine(Player player) {
        correctAnswerCounter = 0;
        Cli.start(player);
    }
    public void showQuestion(String question) {
        System.out.println("Question: " + question);
    }
    public String getAnswer() {
        System.out.print("Your answer: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
    public void checkResult(Player player, String playerAnswer,
                                       String correctAnswer) {
        if (playerAnswer.toLowerCase().equals(correctAnswer)) {
            System.out.println("Correct!");
            correctAnswerCounterInc();
        } else {
            System.out.println("`" + playerAnswer + "` is wrong answer ;(. "
                    + "Correct answer was `" + correctAnswer + "`");
            System.out.println("Let's try again, " + player.getName()
                    + "!");
            System.exit(0);
            //correctAnswerCounterReset();
        }
    }
    public int getCorrectAnswerCounter() {
        return correctAnswerCounter;
    }

    public void correctAnswerCounterInc() {
        this.correctAnswerCounter += 1;
    }

//    public void correctAnswerCounterReset() {
//        this.correctAnswerCounter = 4;
//    }
}
