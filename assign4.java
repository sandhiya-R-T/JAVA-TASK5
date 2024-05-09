package JavaAdvance;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class assign4 {
public static void main(String args[]) {
	
	Scanner d = new Scanner(System.in);
	System.out.println("Enter your birthdate (yyyy-mm-dd): ");
	
	String birthdateString = d.nextLine();
	LocalDate birthdate = LocalDate.parse(birthdateString);
	LocalDate currentDate = LocalDate.now();
	Period age = Period.between(birthdate, currentDate);
	System.out.println("Your age is: " + age.getYears() + " years, " + age.getMonths() + " months, and  " + age.getDays() + " days.");
	d.close();
}
}
