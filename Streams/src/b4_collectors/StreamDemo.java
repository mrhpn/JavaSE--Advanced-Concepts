package b4_collectors;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Collectors
 * -----
 * If you want to store mutated stream into a some kind of data structure like list, set or map, use collectors. 
 *
 * We can also have methods that does sum or average of the streams.
 * - summingInt, summingDouble, and so on
 * - summarizingInt, summarizingDouble, and so on - returns statistics about stream
 * - joining - joins strings using delimiters
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);
		
		// toList()
		var movieList = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toList());
		System.out.println(movieList.getClass()); // Output: class java.util.ArrayList
		
		// toSet()
		var movieSet = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toSet());
		System.out.println(movieSet.getClass()); // Output: class java.util.HashSet
		
		// toMap() -> specify which is key and which is value
		var movieMap = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.toMap(Movie::getTitle, Movie::getLikes)); // maping title to likes
		System.out.println(movieMap.getClass()); // Output: class java.util.HashMap
		
		// toMap() -> maping title to entire movie object
		var movieMap1 = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
			 // .collect(Collectors.toMap(Movie::getTitle, m -> m)); // maping title to entire movie object
				.collect(Collectors.toMap(Movie::getTitle, Function.identity())); // better way to map title to entire movie object
		System.out.println(movieMap1); // Output: {b=b4_collectors.Movie@816f27d, c=b4_collectors.Movie@87aac27}
		
		// Collectors.summingInt()
		var result = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.summingInt(Movie::getLikes));
		System.out.println(result); // Output: 50
		
		// Collectors.summarizingInt()
		var result1 = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.collect(Collectors.summarizingInt(Movie::getLikes));
		System.out.println(result1); // Output: IntSummaryStatistics{count=2, sum=50, min=20, average=25.000000, max=30}
		
		// Joining values using delimiters
		var result2 = movies
				.stream()
				.filter(m -> m.getLikes() > 10)
				.map(Movie::getTitle)
				.collect(Collectors.joining(", "));
		System.out.println(result2); // Output: b, c
	}
}
