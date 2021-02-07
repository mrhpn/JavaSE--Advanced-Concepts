package a4_variable_capture;

public class LambdasDemo {
	private static String subfix = "+";
	
	public static void show() {
		String prefix = "-";
		/**
		 * Lambda Expression can access local variable and class's static and instance fields.
		 */
		greet(message -> System.out.println(prefix + message + subfix)); // Output: -Hello World+
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
}
