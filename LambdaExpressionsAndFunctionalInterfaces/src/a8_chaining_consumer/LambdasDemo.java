package a8_chaining_consumer;

import java.util.List;
import java.util.function.Consumer;

/**
 * Consumer Interface
 * -----
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
 * 
 * Consumer interface has also a default method called `andThen` which takes a Consumer object as an argument.
 * With this method, we can chain many consumers or can perform many operations in sequence.
 *
 */
public class LambdasDemo {
	public static void show() {
		List<String> list = List.of("a", "b", "c");
		
		 // The right-side lambda expression must match the singture of `accept(T t)` which is from Consumer interface.
		Consumer<String> print = item -> System.out.println(item);
		Consumer<String> printUpperCase = item -> System.out.println(item.toUpperCase());
		
		// Chaining consumers
		list.forEach(print.andThen(printUpperCase));
	}
}
