package JavaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class assing3 {
public static void main(String args[]) {
	
	List<String> studentNames = Arrays.asList("Anu","Aravindh","Bala","Arun","Vinay","Akash");
	List<String> studentsWithA = studentNames.stream().filter(name -> name.startsWith("A")).collect(Collectors.toList());
	
	System.out.println("Students whose name starts with 'A':");
	studentsWithA.forEach(System.out::println);
}
}
