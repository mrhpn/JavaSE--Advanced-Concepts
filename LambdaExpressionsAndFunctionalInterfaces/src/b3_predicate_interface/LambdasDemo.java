package b3_predicate_interface;

import java.util.function.Predicate;

/**
 * Predicate Interface
 * 
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/Predicate.html
 * -----
 * Predicate interface is also a functional interface because it has only a single abstract method, boolean test(T t).
 * We use this interface to filter data. It checks if the given T-type object satisfies some criteria.
 * 
 * Another Varations
 * ---
 * 1) BiPredicate<T,U> => boolean test(T t, U u)
 * 2) IntPredicate => boolean test(int value)
 *
 */
public class LambdasDemo {
	public static void show() {
		Predicate<String> isLongerThan5 = str -> str.length() > 5;
		var result = isLongerThan5.test("sky");
		System.out.println(result); // Output: false
	}
}
