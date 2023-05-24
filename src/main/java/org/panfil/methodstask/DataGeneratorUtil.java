package org.panfil.methodstask;

import java.util.Random;
import java.util.UUID;

public class DataGeneratorUtil {
    private static Random random = new Random();

    //Random INT
    public static int getRandomInt(int min, int max) {
        if (min >= max) {
            System.out.println("Valoarea minima trebuie sa fie mai mica ca cea maxima");
            return 0;
        }
        //min = 100 , max = 150;
        int delta = max - min;
        //delta==50;
        int deltaRandomInt = random.nextInt(delta);
        int randomNumber = deltaRandomInt + min;
        //random de la 0 pana la delta , adica 5.
        return randomNumber;

    }

    public static int getRandomInt(int limit) {
        return random.nextInt(limit);
    }

    public static double getRandomDouble(double limit) {
        if (limit <= 0) {
            System.out.println("Limita trebuie sa fie pozitiva");
            return 0;
        }
        return random.nextDouble() * limit;
    }

    public static boolean getRandomBoolean() {
        return random.nextBoolean();
    }

    public static String getRandomEmail() {
        String uuid = UUID.randomUUID().toString();
        String domain = "mailinator.com";
        return uuid + domain;
    }

    public static String generateValidRandomString(int lenght) {
        String acceptedChars = ("ABCDEFGHEJKLMNOPRSTQabdcdefghijklmnoprstq01234567");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int randomIndex = getRandomInt(0, acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }

    public static String generateInvalidRandomString(int lenght) {
        String acceptedChars = "!@#$%^&*:><&";
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < lenght; i++) {
            int randomIndex = getRandomInt(0, acceptedChars.length());
            stringBuilder.append(acceptedChars.charAt(randomIndex));
            System.out.println("In iteratia: i = " + i + " caracterul alipit este " + acceptedChars.charAt(randomIndex));
        }
        return stringBuilder.toString();
    }
}
