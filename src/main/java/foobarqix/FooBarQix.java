package foobarqix;

import java.util.HashMap;
import java.util.Map;

/**
 * Renvoie le nombre en chaine. Sauf quand il est divisible par une valeur particulière :
 * Quand divisible par 3 : renvoie "Foo"
 * Quand divisible par 5 : renvoie "Bar"
 * Quand divisible par 7 : renvoie "Qix"
 * Quand divisible par plusieurs diviseurs : renvoie les chaines correspondantes concaténées.
 */
public class FooBarQix {

    private static final Map<Integer, String> DIVISORS = new HashMap<>();

    static {
        DIVISORS.put(3, "Foo");
        DIVISORS.put(5, "Bar");
        DIVISORS.put(7, "Qix");
    }

    public String convert(int number) {
        StringBuilder builder = new StringBuilder();

        DIVISORS.forEach((divisor, divisorString) -> {
            appendIfDivisible(number, builder, divisorString, divisor);
        });

        boolean isDivisibleBySomething = builder.length() > 0;
        String divisorsRepresentation = builder.toString();
        return isDivisibleBySomething ? divisorsRepresentation : stringRepresentationOf(number);
    }

    private void appendIfDivisible(int number, StringBuilder builder, String divisorString, int divisorNumber) {
        if (isDivisibleBy(divisorNumber, number)) {
            builder.append(divisorString);
        }
    }

    private String stringRepresentationOf(int number) {
        return Integer.toString(number);
    }

    private boolean isDivisibleBy(int divisor, int number) {
        return number % divisor == 0;
    }

}
