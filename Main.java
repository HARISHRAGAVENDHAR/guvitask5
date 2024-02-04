package school;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = Arrays.asList("Anand", "Baasha", "Arav", "Anniyan", "David", "Amy", "Andrew", "Sarah", "Adam", "Michael");

        // Filter students whose names start with "A"
        List<String> studentsWithA = studentNames.stream()
                                                .filter(name -> name.startsWith("A"))
                                                .collect(Collectors.toList());

        // Print the students with names starting with "A"
        System.out.println("Students with names starting with 'A':");
        for (String student : studentsWithA) {
            System.out.println(student);
        }
    }
}
