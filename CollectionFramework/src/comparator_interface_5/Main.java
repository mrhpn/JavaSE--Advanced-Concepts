package comparator_interface_5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * We can sort object by implementing Comparable interface.
 * 
 * But this Comparable interface is not very flexible. For example, we are fixed comparaing by customers only with the name.
 * What if we need to compare with their email or address? 
 * Here, `Comparator` interface comes to the recuse.
 *
 */
public class Main {

	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("b", "e3"));
		customers.add(new Customer("c", "e2"));
		customers.add(new Customer("a", "e1"));
		Collections.sort(customers, new EmailComparator());
		System.out.println(customers); // Output: [a, c, b]

	}

}
