package org.example.homework.homework_14;

import java.util.List;
import java.util.Random;

public class UserProvider {
    private static final Random RANDOM = new Random();

    private static final List<String> MALE_NAMES = List.of("Vasyl", "Mykola", "Petro", "Danylo", "Ignat",
            "Marko", "Mykyta", "Nestor", "Ostap", "Oleksa", "Orest", "Stepan", "Taras", "Oles", "Pylyp");
    private static final List<String> FEMALE_NAMES = List.of("Hanna", "Bohdana", "Bozhena", "Zoryana", "Ivanna",
            "Kateryna", "Maria", "Melania", "Solomia", "Sofia", "Stefania", "Roksolyana", "Khrystyna", "Motrona", "Oksana");

    private static final List<String> EMAILS = List.of("null", "@gmail.com", "@ukr.net", "@i.ua", "@meta.ua");

    public static User generateUser() {

        String name = null;

        Gender gender = Gender.randomGender();
        if (gender.equals(Gender.MALE)) {
            name = MALE_NAMES.get(RANDOM.nextInt(MALE_NAMES.size()));
        } else if (gender.equals(Gender.FEMALE)) {
            name = FEMALE_NAMES.get(RANDOM.nextInt(FEMALE_NAMES.size()));
        }

        int age = (int) (Math.random()*100);

        String email = EMAILS.get(RANDOM.nextInt(EMAILS.size()));
        if (email.equals("null")) {
            email = null;
        } else {
            email = name.toLowerCase() + email;
        }

        return User.builder()
                .name(name)
                .gender(gender)
                .age(age)
                .email(email)
                .build();
    }

}

