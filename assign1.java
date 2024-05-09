package JavaAdvance;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class assign1 {
	public static void main(String args[]) {
		Stream<String> names = Stream.of("aBc","d","ef");
		List<String> uppercaseNames = names.map(String::toUpperCase).collect(Collectors.toList());
		System.out.println(uppercaseNames);
	}
}
