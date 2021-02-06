package queue_interface_6;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueDemo {
	public static void show() {
		Queue<String> queue = new ArrayDeque<>();
		
		// Adding elements: when queue size is full, `add` throws exception while `offer` returns false.
		queue.add("c");
		queue.add("a");
		queue.add("b");
		queue.offer("d");
		
		// Getting the first element of a queue: when queue is empty, `element` throws exception while `peek` returns null. 
		var front = queue.element();
		var front1 = queue.peek();
		System.out.println(front); // Output: c
		System.out.println(front1); // Output: c
		
		// Removing element from a queue: when queue is empty, `remove` throws exception while `poll` returns null.
		var front2 = queue.remove();
		var front3 = queue.poll();
		System.out.println(front2); // Output: c
		System.out.println(front3); // Output: a
		System.out.println(queue); // Output: [b, d]
	}
}
