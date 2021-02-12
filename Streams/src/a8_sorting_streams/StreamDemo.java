package a8_sorting_streams;

import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

/**
 * Sorting Streams
 * -----
 * In Java, we have 2 ways to sort:
 * 1) Comparable interface (for example, implements in Movie Class)
 * 2) Comparator interface (more flexible)
 * 
 * In stream, there are 2 overloaded sorted methods
 * 1) sorted() 
 * 		-> This will rely on the object that is passed, in this case Movie, and in Movie class, we MUST implement Comparable interface.
 * 2) sorted(Comparator<?>) 
 * 		-> This needs to get Object that implements Comparator interface. OR...
 * 		-> Comparator interface is a functional interface because it has one single abstract method `compare(T o1, T o2)`.
 * 		   So, we can pass lambda expression to this sorted(Comparator<?>).
 */
public class StreamDemo {
	public static void show() {
		var movies = List.of(
			new Movie("c", 10),
			new Movie("a", 30),
			new Movie("b", 20)
		);
		
		// sorted(Comparator<?>) -> `compare(T o1, T o2)` -> the lambda expression must match this method signature.
		movies.stream()
			  .sorted((a, b) -> a.getTitle().compareTo(b.getTitle()))
			  .sorted(Comparator.comparing(m -> m.getTitle())) // comparing() is *static* method in Comparator interface. Since all we doring here is calling a method, we can use `method reference` like below.
			  .sorted(Comparator.comparing(Movie::getTitle)) // Using `Method Reference`
			  .sorted(Comparator.comparing(Movie::getTitle).reversed()) // reversed() is *default* method in Comparator interface.
			  .forEach(m -> System.out.println(m.getTitle())); // Output: c b a
	}
}
