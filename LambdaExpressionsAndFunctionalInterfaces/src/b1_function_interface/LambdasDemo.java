package b1_function_interface;

import java.util.function.Function;

/**
 * Function Interface Function<T,R>
 * -----
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/Function.html
 * 
 * Function<T, R> => This interface takes a T type argument and returns a R type value.
 * - T represents type of argument and 
 * - R represents type of return value.
 * 
 * It is a functional interface because it has only a single abstract method, `R apply(T t)`. 
 * 
 * Specialized Variation
 * ---
 * It also has a variation which is `BiFunction<T,U,R>`, which takes 2 arguments and returns a value.
 * 
 * Primitive Variation 
 * ---
 * There are 3 categories when it comes to primitive variation. Let's only say for int for simplicity. But keep in mind there are also long and double version.
 * 1) IntFunction<R>    => R apply(int value)          => Argument has specified type and return value is parameterized.
 * 2) ToIntFunction<T>  => int applyAsInt(T value)     => Argument is parameterized and return value is speccified.
 * 3) IntToLongFunction => long applyAsLong(int value) => Both argument and return type are specialized.
 */
public class LambdasDemo {
	public static void show() {
		Function<String, Integer> map = str -> str.length();
		var length = map.apply("sky");
		System.out.println(length);
	}
}
