package b5_grouping_elements;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Grouping elements
 * -----
 * 1) grouping elements
 * 2) changing into different data structures
 * 3) counting
 * 4) joining with delimiters
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10, Genre.THRILLER),
				new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION)
		);
		
		// Grouping elements
		var result = movies
				.stream()
				.collect(Collectors.groupingBy(Movie::getGenre)); // type: Map<Genre, List<Movie>> 
		System.out.println(result); // Output: {ACTION=[b5_grouping_elements.Movie@6ce253f1, b5_grouping_elements.Movie@53d8d10a], THRILLER=[b5_grouping_elements.Movie@e9e54c2]}
		
		// Changing into different data structures 
		var result1 = movies
				.stream()
				.collect(Collectors.groupingBy(Movie::getGenre, Collectors.toSet())); // type: Map<Genre, Set<Movie>>
		
		// Counting
		var result2 = movies
				.stream()
				.collect(Collectors.groupingBy(Movie::getGenre, Collectors.counting()));
		System.out.println(result2); // Output: {ACTION=2, THRILLER=1}
		
		
		// Joining with delimiters
		var result3 = movies
				.stream()
				.collect(Collectors.groupingBy(Movie::getGenre, Collectors.mapping(Movie::getTitle, Collectors.joining(", "))));
		System.out.println(result3); // Output: {ACTION=b, c, THRILLER=a}
	}
}
