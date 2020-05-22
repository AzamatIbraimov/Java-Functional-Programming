package stream;

import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class _Id {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person(1, "Azamat", Gender.MALE,null),
                new Person(2, "Aicha", Gender.FEMALE,null),
                new Person(3, "Akyl", Gender.MALE,"Email"),
                new Person(4, "Aima", Gender.FEMALE,null),
                new Person(5, "Sultan", Gender.MALE,"@mail")
        );
        persons.stream()
                .filter(person -> person.name.contains("A"))
                .map(person -> person.name)
                .collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(persons.stream().noneMatch(person -> person.name.equals("Azamat")));

        persons.stream()
                .filter(person -> person.email.contains("@"))
                .map(person -> person.name)
                .forEach(System.out::println);


    }

    static class Person {
        private final Integer id;
        private final String name;
        private final Gender gender;
        private final String email;


        public Person(Integer id, String name, Gender gender,String email) {
            this.id = id;
            this.name = name;
            this.gender = gender;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", gender=" + gender +
                    ", email='" + email + '\'' +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
