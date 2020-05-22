package functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {
    public static void main(String[] args) {
        Person Azamat = new Person("Azamat", "880535535");
        greet.accept(Azamat);
        greetV2.accept(Azamat,false);
    }

    static BiConsumer<Person,Boolean> greetV2= (person, hidePhone) ->
            System.out.println("Hello " + person.name+ "Your phone number is " +
                    (hidePhone ? person.phone : "******"));

    static Consumer<Person> greet= person ->
            System.out.println("Hello " + person.name+ "Your phone number is " + person.phone);
    static class Person {
        private final String name;
        private final String phone;

        public Person(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }
}
