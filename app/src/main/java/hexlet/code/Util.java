package hexlet.code;

import java.util.Random;

public class Util {

    public static int getRandomPositiveInt(int upperBound) {
        Random random = new Random();
        var randomNumber = random.nextInt(upperBound) + 1;
        return randomNumber;
    }
}
