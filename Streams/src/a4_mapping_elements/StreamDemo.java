package a4_mapping_elements;

import java.util.List;
import java.util.stream.Stream;

/**
 * Mapping Streams
 * -----
 * 1) map()
 * 2) flatMap()
 */
public class StreamDemo {
	public static void show() {
		// 1) map()
		var movies = List.of(
			new Movie("a", 10),
			new Movie("b", 20),
			new Movie("c", 30)
		);
		
		movies
			.stream()
			.map(movie -> movie.getTitle())
			.forEach(title -> System.out.println(title));
		
		// 1.1) mapToInt()
		movies
			.stream()
			.mapToInt(movie -> movie.getLikes())
			.forEach(like -> System.out.println(like));
		
		// 2) flatMap()
		var stream = Stream.of(List.of(1, 2, 3), List.of(4, 5, 6));
		// stream.forEach(list -> System.out.println(list)); // Output: [1, 2, 3] [4, 5, 6]
		
		// If you want to flatern the [1, 2, 3] [4, 5, 6], use flatMap()
		stream
			.flatMap(list -> list.stream())
			.forEach(n -> System.out.print(n)); // Output: 123456
	}
}
