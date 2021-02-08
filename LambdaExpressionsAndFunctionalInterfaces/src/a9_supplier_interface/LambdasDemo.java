package a9_supplier_interface;

import java.util.function.Supplier;

/**
 * Supplier Interface
 * -----
 * Documentation: https://docs.oracle.com/javase/8/docs/api/java/util/function/Supplier.html
 * 
 * Supplier interface is a functional interface because it has a single abstract method, `T get()`.
 * So, we can represent it as a lambda expression.
 *
 */
public class LambdasDemo {
	public static void show() {
		// When we run the program, this lambda expression will not immediately run unless we don't explicity call it, like getRandom.get().
		// This is called Lazy-Evaluation.
		// If you are working with premitive types, you should use primitive suppliers like `DoubleSupplier`, `IntSupplier`, `BooleanSupplier` and so on.
		Supplier<Double> getRandom = () -> Math.random();
		var random = getRandom.get(); // When we call supplier interface, we should call like this.
		System.out.println(random);
		
	}
}
