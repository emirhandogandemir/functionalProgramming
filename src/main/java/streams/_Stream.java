package streams;


import imperativeAndDeclarative.Main;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(

                new Person("ahmet", Gender.MALE),
                new Person("ahmet", Gender.MALE),
                new Person("özge", Gender.FEMALE),
                new Person("samet", Gender.MALE),
                new Person("öznur", Gender.FEMALE),
                new Person("ahmet", Gender.MALE),
                new Person("ahmet", Gender.PREFER_NOT_TO_SAY)

        );

        Function<Person, String> personStringFunction = person -> person.name;
        ToIntFunction<String> lenght = String::length;
        IntConsumer println = System.out::println;

        //    people.stream()
        //           .map(personStringFunction)
        //          .mapToInt(lenght)
        //          .forEach(println);

        boolean containsOnlyFemales = people.stream()
                .anyMatch(person -> Gender.FEMALE.equals(person.gender));

        System.out.println(containsOnlyFemales);


    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE, PREFER_NOT_TO_SAY
    }
}
