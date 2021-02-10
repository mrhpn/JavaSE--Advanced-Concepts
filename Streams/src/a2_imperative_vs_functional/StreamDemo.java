package a2_imperative_vs_functional;

import java.util.List;

public class StreamDemo {
	public static void show() {
		List<Movie> movies = List.of(new Movie("a", 10), new Movie("b", 20), new Movie("c", 30));
		
		// Imparative Programming
		int count = 0;
		for (var movie : movies)
			if (movie.getLikes() > 10)
				count++;
		
		// Functional Programming
		var count2 = movies.stream()
			.filter(movie -> movie.getLikes() > 10)
			.count();
		
		System.out.println(count); // Output: 2
		System.out.println(count2); // Output: 2
			
	}
}
