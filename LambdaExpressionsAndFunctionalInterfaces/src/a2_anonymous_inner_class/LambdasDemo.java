package a2_anonymous_inner_class;

public class LambdasDemo {
	public static void show() {
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
