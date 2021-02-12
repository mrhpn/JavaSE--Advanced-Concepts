package b2_reducers;

import java.util.Comparator;
import java.util.List;

/**
 * Reducers (Terminal Operations)
 * -----
 * Reducers can reduce a stream of objects into a single object/value. All of them are terminal operations.
 * 1) count()
 * 
 * 2) anyMatch(predicate)
 * 3) allMatch(predicate)
 * 4) noneMatch(predicate)
 * 
 * 5) findFirst()
 * 6) findAny()
 * 
 * 7) max(comparator)
 * 8) min(comparator)
 *
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);

		// count()
		var count = movies.stream().count();
		System.out.println(count); // Output: 3
		
		/**----- Matchers -----**/
		// anyMatch(predicate)
		var result = movies.stream().anyMatch(m -> m.getLikes() > 10);
		System.out.println(result); // Output: true
		
		// allMatch(predicate)
		var result1 = movies.stream().allMatch(m -> m.getLikes() > 10);
		System.out.println(result1); // Output: false
		
		// noneMatch(predicate) -> checks if none of the elements in the stream matchs the condition
		var result2 = movies.stream().noneMatch(m -> m.getLikes() > 10);
		System.out.println(result2); // Output: false
		/**----- End Matchers -----**/
		
		/**----- Finders -----**/
		var result3 = movies.stream().findFirst().get(); // findFirst() returns Optional<?> which is prevention of nullPointerException.
		System.out.println(result3.getTitle()); // Output: a
		
		var result4 = movies.stream().findAny().get(); // returns any elements from the stream
		System.out.println(result4.getTitle());
		/**----- End Finders -----**/
		
		var result5 = movies
				.stream()
				.max(Comparator.comparing(Movie::getLikes))
				.get();
		System.out.println(result5.getTitle()); // Output: c
		
		
		
		
		
	}
}
