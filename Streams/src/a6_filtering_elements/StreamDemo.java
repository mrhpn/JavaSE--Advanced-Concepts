package a6_filtering_elements;

import java.util.List;
import java.util.function.Predicate;

/**
 * Important Note
 * -----
 * There are 2 types of methods when it comes to stream methods.
 * 1) intermediate (eg. map(), filter())
 * 2) terminal (eg. forEach())
 * 
 * If you stop chaining after using intermediate method without calling terminal methods, it will returns a new stream and nothing is done.
 *
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
			new Movie("a", 10),
			new Movie("b", 20),
			new Movie("c", 30)
		);
		
		Predicate<Movie> isPopular = m -> m.getLikes() > 10;
		
		movies.stream()
			  .filter(isPopular)
			  .forEach(m -> System.out.print(m.getTitle())); // Output: b c
	}
}
