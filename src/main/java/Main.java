import java.util.List;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        List<Person> persons = List.of(
                new Person("Azamat", Gender.MALE),
                new Person("Aicha", Gender.FEMALE),
                new Person("Akyl", Gender.MALE),
                new Person("Aima", Gender.FEMALE),
                new Person("Sultan", Gender.MALE)
        );
        persons.stream().filter(person -> person.gender.equals(Gender.MALE)).forEach(System.out::println);
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
        MALE, FEMALE
    }
}
