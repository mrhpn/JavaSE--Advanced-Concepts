package b5_unary_operator_interface;

import java.util.function.UnaryOperator;

/**
 * Unary Operator Interface (which extends Function<T,T> => takes T-type arg and returns T-type value.)
 * 
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/UnaryOperator.html
 * -----
 * This is a functional interface and can therefore be used as a lambda expression or method reference.
 */
public class LambdasDemo {
	public static void show() {
		UnaryOperator<Integer> square = n -> n * n;
		UnaryOperator<Integer> increment = n -> n + 1;
		
		var result = increment.andThen(square).apply(1);
		System.out.println(result); // Output: 4
	}
}
