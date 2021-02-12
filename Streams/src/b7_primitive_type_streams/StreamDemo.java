package b7_primitive_type_streams;

import java.util.stream.IntStream;

/**
 * If you want to use stream for only primitive types, it is more efficient to use primitive type streams such as:
 * - IntStream
 * - LongStream
 * - DoubleStream
 */
public class StreamDemo {
	public static void show() {
		IntStream.range(1, 5).forEach(System.out::print); // Output: 1234 
		IntStream.rangeClosed(1, 5).forEach(System.out::print); // Output: 12345
	}
}
