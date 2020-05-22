package functions;

import java.util.function.Supplier;

public class _Supplier {
    public static void main(String[] args) {
        System.out.println(getJDBC.get());
    }
    static Supplier<String> getJDBC = () ->
            "JDBC:localhost:1234";
}
