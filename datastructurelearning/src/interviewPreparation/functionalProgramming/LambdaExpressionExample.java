package interviewPreparation.functionalProgramming;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaExpressionExample {

    public static void main(String[] args) {
        String s1 = "Hello";
        Predicate<String> isEmpty = String::isEmpty;

        Function<String,Integer> lengthOftheString = String::length;

        Consumer<String> printString = System.out::println;

        Supplier<String> stringSupplier = () -> "Hello";

        System.out.println(isEmpty.test(s1));
        System.out.println(lengthOftheString.apply(s1));
        printString.accept(s1);
        System.out.println(stringSupplier.get());
    }
}
