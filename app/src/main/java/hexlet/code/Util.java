package hexlet.code;

import java.util.Random;

public class Util {

    public static int getRandomPositiveInt(int upperBound) {
        Random random = new Random();
        var randomNumber = random.nextInt(upperBound) + 1;
        return randomNumber;
    }

    public static int getRandomWithBound(int lowerBound, int upperBound) {
        Random random = new Random();
        var randomNumber = random.nextInt(upperBound) + lowerBound;
        return randomNumber;
    }

    public static int getGCD(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return getGCD(n2, n1 % n2);
    }

=
