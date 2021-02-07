package a7_consumer_interface;

import java.util.List;

/**
 * Consumer Interface
 * -----
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/Consumer.html
 * 
 * Consumer interface is a functional interface because it has a single abstract method, `accept(T t)`.
 * So, we can represent it as a lambda expression.
 *
 */
public class LambdasDemo {
	public static void show() {
		List<Integer> list = List.of(1, 2, 3);
		
		// Impreative Programming (for, if/else, switch/case)
		for (int item : list)
			System.out.println(item);
		
		// Declarative Programming
		/**
		 * forEach accepts Consumer interface so we can pass a lambda expression which takes a value and doesn't return a value.
		 */
		list.forEach(item -> System.out.println(item));
	}
}
