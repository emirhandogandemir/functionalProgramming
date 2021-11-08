package finalSection;

import java.util.Locale;
import java.util.function.Function;

public class Lambdas {

    public static void main(String[] args) {

        Function<String,String> upperCaseName = name -> {
            //logic
            if(name.isBlank()) throw new IllegalArgumentException("");
            return name.toUpperCase();
        };

        System.out.println(upperCaseName.apply("John"));
    }
}
