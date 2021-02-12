package a7_slicing_streams;

import java.util.List;
import java.util.function.Predicate;

/**
 * Slicing Streams
 * -----
 * There are 4 methods to slice a stream.
 * 1) limit(n)
 * 2) skip(n)
 * 3) takeWhile(predicate) // difference between filter() -> takeWhile returns immediately when predicate returns false, filter iterate all entire stream.
 * 4) dropWhile(predicate)
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
			new Movie("a", 10),
			new Movie("b", 30),
			new Movie("c", 20)
		);
		
		// limit(n)
		movies.stream()
			  .limit(2)
			  .forEach(m -> System.out.print(m.getTitle())); // Output: ab
		
		// skip(n)
		movies.stream()
			  .skip(2)
			  .forEach(m -> System.out.println(m.getTitle())); // Output: c
		
		// takeWhile(predicate)
		movies.stream()
			  .takeWhile(m -> m.getLikes() < 30)
			  .forEach(m -> System.out.println(m.getTitle())); // Output: a
		
		// dropWhile(predicate)
		movies.stream()
			  .dropWhile(m -> m.getLikes() < 30)
			  .forEach(m -> System.out.println(m.getTitle())); // Output: b c
	}
}
