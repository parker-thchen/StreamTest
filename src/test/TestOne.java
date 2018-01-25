package test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestOne {

	public static void main(String[] args) {
		// Arrays.asList("a1", "a2", "a3")
		// .stream()
		// .findFirst()
		// .ifPresent(System.out::println); // a1

		Arrays.asList("a1", "a2", "a3", "b4", "a4", "04", "b4").stream().sorted().forEach(System.out::println);

		List<Integer> listSource = new ArrayList<Integer>();
		Collections.addAll(listSource, 0, 1, 2, 3, 4, 5, 6, 12, 18);
		List<Integer> listGreaterThen3 = listSource.stream().filter((t) -> (t >= 4) ? true : false)
				.collect(Collectors.toList());
		System.out.println(listGreaterThen3);

		int max1 = listSource.stream().filter((t) -> (t > 2) ? true : false).mapToInt((t) -> t * 2).max().getAsInt();

		System.out.println(new StringBuffer().append("max1:").append(max1).toString());
		int max2 = listSource.stream().filter((t) -> (t > 2) ? true : false).mapToInt((t) -> t * 2).reduce(0,
				(a, b) -> (a > b) ? a : b);

		System.out.println(new StringBuffer().append("max2:").append(max2).toString());
		int max3 = listSource.stream().filter((t) -> (t > 2) ? true : false).mapToInt((t) -> t * 2).reduce(0,
				Integer::max);

		System.out.println(new StringBuffer().append("max3:").append(max3).toString());
	}
}
