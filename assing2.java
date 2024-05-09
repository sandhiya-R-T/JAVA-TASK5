package JavaAdvance;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class assing2 {
public static void main(String args[]) {
	List<String> strings = Arrays.asList("abc","","bcd","efg","abcd","","jkl");
	List<String> nonEmptyStrings = strings.stream().filter(str -> !str.isEmpty()).collect(Collectors.toList());
	System.out.println("Non-empty strings: ");
	System.out.println(nonEmptyStrings);
}
}
