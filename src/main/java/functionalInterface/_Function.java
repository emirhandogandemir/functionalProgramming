package functionalInterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {

    public static void main(String[] args) {
        //Function takes 1 argument and produces 1 result
        int increment = increment(0);
        System.out.println(increment);

        int increment2 = incrementByOneFunction.apply(0);
        System.out.println(increment2);

        int multiply = multipleBy10Function.apply(increment2);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10 = incrementByOneFunction.andThen(multipleBy10Function);
        System.out.println(addBy1AndThenMultiplyBy10.apply(3));

        //BiFunction takes 2 argument and produces 1 result
        System.out.println(incrementByOneAndMultiplyByTen.apply(4, 100));

    }

    static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

    static Function<Integer, Integer> multipleBy10Function = number -> number * 10;

    static int increment(int number) {
        return number + 1;
    }

  static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByTen =
            (numberToIncrementByOne, numberToMultiplyBy)
                    -> (numberToIncrementByOne + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiplyByTen(int number, int numToMultiplyBy) {
        return (number + 1) * numToMultiplyBy;
    }


}
