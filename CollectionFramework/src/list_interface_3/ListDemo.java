package list_interface_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Collection doesn't care about index. It's all about adding, removing and so on. 
 * If you need the index in your application, use List interface.
 *
 * Documentation: List - https://docs.oracle.com/javase/8/docs/api/java/util/List.html
 */
public class ListDemo {
	public static void show() {
		List<String> list = new ArrayList<>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.add(0, "!"); // In collection interface, we can't do this because they don't support indexing.
		System.out.println(list); // Output: [!, a, b, c]
		
		// Adding multiple items
		Collections.addAll(list, "d", "e", "f");
		
		// Adding item using set method
		list.set(0, "@");
		
		// Getting with index
		System.out.println(list.get(0)); // Output: @
		
		// Removing item using index
		list.remove(0);
		
		// Getting sub list, it returns new list and doesn't affect the original list
		List<String> newList = list.subList(0, 2);
		System.out.println(newList); // Output: [a, b]
	}
}
