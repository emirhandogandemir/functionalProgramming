package optionals;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        Supplier<IllegalStateException> exception = () ->
                new IllegalStateException("exception");

    Object value = Optional.ofNullable("Hello")
                .orElseThrow(exception);

        Optional.ofNullable("john@gmail.com")
                .ifPresent(email -> System.out.println("sENDİNG EMAİL TO "+email));

        System.out.println(value);
    }
}
