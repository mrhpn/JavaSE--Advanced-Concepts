package a3_creating_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * Creating Streams
 * -----
 * 1) From Collections
 * 2) From Arrays
 * 3) From an arbitrary number of objects
 * 4) Infinite/finite streams
 */
public class StreamDemo {
	public static void show() {
		// 1) From Collections
		List<Integer> numbers = List.of(1, 2, 3, 4, 5);
		numbers
			.stream()
			.forEach(n -> System.out.println(n));
		
		// 2) From Arrays
		int[] numbers1 = { 1, 2, 3, 4, 5 };
		Arrays
			.stream(numbers1)
			.forEach(n -> System.out.println(n));
		
		// 3) From an arbitrary number of objects
		Stream
			.of(1, 2, 3)
			.forEach(n -> System.out.println(n));
		
		// 4) Infinite/finite streams 
		// 4.1) generate()
		// This generate method will be excuted only when we read from stream. This is called Lazy-Evaluation.
		Stream
			.generate(() -> Math.random())
			.limit(3)
			.forEach(n -> System.out.println(n));
		// 4.2) iterate()
		// This generate method will be excuted only when we read from stream. This is called Lazy-Evaluation.
		Stream
			.iterate(1, n -> n + 1)
			.limit(10)
			.forEach(n -> System.out.println(n));
	}
}
