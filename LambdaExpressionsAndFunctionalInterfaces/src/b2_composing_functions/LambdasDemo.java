package b2_composing_functions;

import java.util.function.Function;

/**
 * Composing Functions
 * -----
 * 1) andThen()
 * 2) compose()
 *
 */
public class LambdasDemo {
	public static void show() {
		// key:value
		// first: key=value
		// second: {key=value}
		Function<String, String> replaceColon = str -> str.replace(':', '=');
		Function<String, String> addBraces = str -> "{" + str + "}";
		
		// Declarative Programming Style: what needs to be done
		String result = replaceColon.andThen(addBraces).apply("key:value");
		String answer = addBraces.compose(replaceColon).apply("key:value");
		
		System.out.println(result); // Output: {key=value}
		System.out.println(answer); // Output: {key=value}
	}
}
