package org.example.homework.homework_14;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@Builder
public class User {
    private String name;
    private Gender gender;
    private int age;
    private String email;
}

