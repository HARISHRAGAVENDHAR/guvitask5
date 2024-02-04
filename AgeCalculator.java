package school;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			// Prompt user to enter birthdate
			System.out.print("Enter your birthdate (yyyy-mm-dd): ");
			String birthdateString = scanner.nextLine();

			// Parse birthdate string into LocalDate object
			LocalDate birthdate = LocalDate.parse(birthdateString);

			// Calculate age
			LocalDate currentDate = LocalDate.now();
			Period age = Period.between(birthdate, currentDate);

			// Display age
			System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and " + age.getDays() + " days.");
		}
    }
}
