package b4_binary_operator_interface;

import java.util.function.BinaryOperator;
import java.util.function.Function;

/**
 * Binary Operator Interface (which extends BiFunction<T,T,T>)
 * 
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/BinaryOperator.html
 * -----
 * This is a functional interface and can therefore be used as a lambda expression or method reference.
 * It inherits two methods from its super interface BiFunction, which are andThen and apply.
 * 
 * It takes 2 arguments of type T and returns a value of type T. The most simpliest example is 2 + 2 = 4.
 * 
 * Another Varations
 * ---
 * 1) IntBinaryOperator => takes two primitive integers and returns an integer.
 */
public class LambdasDemo {
	public static void show() {
		// In the below example, the primitive integers need to be autoboxed inside Integer wrapper class. 
		// So if you are working with large primitive int numbers, it is more efficient to use `IntBinaryOperator`. 
		BinaryOperator<Integer> add = (a, b) -> a + b;
		Function<Integer, Integer> square = a -> a * a; // this functions takes a Integer-type arg and returns a Integer-type value.
		
		var result = add.andThen(square).apply(1, 2);
		System.out.println(result); // Output: 9
	}
}
