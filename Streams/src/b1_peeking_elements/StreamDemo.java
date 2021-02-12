package b1_peeking_elements;

import java.util.List;

/**
 * peek()
 * -----
 * We can use peek() to see the output of a stream operation. This is useful for trouble-shooting.
 *
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);

		movies.stream()
			  .filter(m -> m.getLikes() > 10)
			  .peek(m -> System.out.println("filtered: " + m.getTitle()))
			  .map(Movie::getTitle)
			  .peek(t -> System.out.println("mapped: " + t))
			  .forEach(System.out::println);
		/**
		 * Output
		 * ---
		 *  filtered: b
		 *	mapped: b
		 *  b
		 *	filtered: c
		 *	mapped: c
		 *	c
		 */
	}
}
