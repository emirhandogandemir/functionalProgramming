package imperativeAndDeclarative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(

                new Person("ahmet", Gender.MALE),
                new Person("ahmet", Gender.MALE),
                new Person("özge", Gender.FEMALE),
                new Person("samet", Gender.MALE),
                new Person("öznur", Gender.FEMALE),
                new Person("ahmet", Gender.MALE),
                new Person("ahmet", Gender.MALE)

        );

        // Imperative approach
        System.out.println("Imperative Approach");
        List<Person> females = new ArrayList<>();
        for (Person person : people) {
            if (Gender.FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }

        for (Person female : females) {
            System.out.println(female);

        }


        System.out.println("Declarative Approach");

        Predicate<Person> personPredicate = p -> Gender.FEMALE.equals(p.gender);

        // Declarative approach
        List<Person> femaless =  people.stream()
                .filter(personPredicate)
                .collect(Collectors.toList());

        femaless.forEach(System.out::println);



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

    public enum Gender {
        MALE, FEMALE
    }
}

