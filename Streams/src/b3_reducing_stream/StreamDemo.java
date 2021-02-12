package b3_reducing_stream;

import java.util.List;
import java.util.Optional;

public class StreamDemo {
	public static void show() {
		var movies = List.of(
				new Movie("a", 10),
				new Movie("b", 20),
				new Movie("c", 30)
		);

		// Optional means an object which may or may not have a value.
		Optional<Integer> sum = movies.stream()
			  .map(m -> m.getLikes())
		   // .reduce((a, b) -> a + b)
			  .reduce(Integer::sum);
		
		int sum1 = movies.stream()
			  .map(m -> m.getLikes())
			  .reduce(0, Integer::sum); // supplying initial value
		
		System.out.println(sum.get()); // Output: 60 - if the sum is null or empty string, it will throw an exception. To prevent this, see below.
		System.out.println(sum.orElse(0)); // Output: 60 - if the sum is null or empty string, supply default value as 0
		
		System.out.println(sum1); // Output: 60
	}
}
