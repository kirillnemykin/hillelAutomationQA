package org.example.homework.homework_14;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

       Map<Gender, List<User>> usersByGender = Stream.generate(UserProvider::generateUser)
                .limit(20)
                .filter(user -> (user.getAge() >= 18))
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> Objects.nonNull(user.getEmail()))
                .collect(Collectors.groupingBy(User::getGender));

       for (Map.Entry<Gender, List<User>> pair : usersByGender.entrySet()) {

           System.out.print("{" + pair.getKey() + "=");

           List<String> names = new ArrayList<String>();
           for(User user : pair.getValue()){
                names.add(user.getName());
           }

           System.out.print(names);
           System.out.print("} ");
       }

    }
}
