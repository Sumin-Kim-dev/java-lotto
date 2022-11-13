package lotto;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<Integer> numbers(String consoleInput) {
        String[] inputs = consoleInput.split(",");
        List<Integer> numbers = new ArrayList<>();
        Arrays.stream(inputs).forEach(input -> numbers.add(number(input)));
        return numbers;
    }

    private static int number(String input) {
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }

    public static long money(String consoleInput) {
        try {
            return Long.parseLong(consoleInput);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException();
        }
    }
}
