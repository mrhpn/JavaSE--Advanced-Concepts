package a9_getting_unique_elements;

import java.util.List;

/**
 * distinct()
 *
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10),
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);

		movies.stream()
			  .map(Movie::getLikes)
			  .distinct()
			  .forEach(m -> System.out.println(m)); // Output: 10 20 30
	}
}
