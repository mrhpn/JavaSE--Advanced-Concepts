package a3_lambda_expressions;

public class LambdasDemo {
	public static void show() {
		
		/**
		 * Lambda Expressions
		 * ---
		 * If we have functional interface like Printer, we can represent that by using a lambda expression. 
		 * That's why these interfaces are called functional interfaces. Because they represent a function.
		 * 
		 * This code is more clean and consice than anonymous inner class.
		 */
		greet(message -> System.out.println(message));
		
		/**
		 * Lambda Expressions can also be stored inside a variable.
		 */
		Printer printer = message -> System.out.println(message); // Printer is a functional interface and right-side lambda must satisfy that interface.
		
		
		/**
		 * Anonymous Inner Class
		 * ---
		 * We don't need another seprate Console Printer class. In some cases, this might be useful.
		 */
		greet(new Printer() {
			@Override
			public void print(String message) {
				System.out.println(message);
			}
		});
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
}
