package method_reference_5;

public class LambdasDemo {
	
	public LambdasDemo(String message) {
		System.out.println(message);
	}
	
	public static void show() {
		/**
		 * Method Reference
		 * -----
		 * Sometimes, all we doing with lambda expressions is passing parameters into the method, like in our case.
		 * If so, it is easier to reference the method directly like below.
		 * 
		 * Syntax: Class/Object::method
		 */
		// 0)
		greet(message -> System.out.println(message));
		greet(System.out::println);
		
		// 1) Using static method reference
		greet(message -> print(message));
		greet(LambdasDemo::print);
		
		// 2) Using instance method reference
		var demo = new LambdasDemo(null);
		greet(message -> demo.print1(message));
		greet(demo::print1);
		
		// 3) Using an constructor
		greet(message -> new LambdasDemo(message));
		greet(LambdasDemo::new);
	}
	
	public static void greet(Printer printer) {
		printer.print("Hello World");
	}
	
	public static void print(String message) {
		System.out.println(message);
	}
	
	public void print1(String message) {
		System.out.println(message);
	}
	
}
