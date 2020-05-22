package optionals;

import java.util.Optional;

public class _Optional {
    public static void main(String[] args) {
        Optional.ofNullable(null).ifPresentOrElse(
                email -> System.out.println("Sending email"),
                () -> System.out.println("cannot send mail!"));
    }
}
