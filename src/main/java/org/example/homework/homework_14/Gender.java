package org.example.homework.homework_14;

import java.util.Random;

public enum Gender {
    MALE, FEMALE;

    private static final Random RANDOM = new Random();
    private static final Gender[] GENDERS = values();

    public static Gender randomGender() {
        return GENDERS[RANDOM.nextInt(GENDERS.length)];
    }



}
