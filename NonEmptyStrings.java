package school;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "", "bc", "efg", "abcd", "", "jkl");

        // Filter non-empty strings
        List<String> nonEmptyStrings = strings.stream()
                .filter(str -> !str.isEmpty())
                .collect(Collectors.toList());

        // Print non-empty strings
        System.out.println("List of non-empty strings:");
        for (String str : nonEmptyStrings) {
            System.out.println(str);
        }
    }
}
