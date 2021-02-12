package b6_partitioning_elements;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10, Genre.THRILLER),
				new Movie("b", 20, Genre.ACTION),
				new Movie("c", 30, Genre.ACTION)
		);
		
		var result = movies
				.stream()
				.collect(
						Collectors.partitioningBy(m -> m.getLikes() > 20,
						Collectors.mapping(Movie::getTitle, Collectors.joining(", "))
						));
		System.out.println(result); // Output: {false=a, b, true=c} // type: Map<Boolean, String>
	}
}
