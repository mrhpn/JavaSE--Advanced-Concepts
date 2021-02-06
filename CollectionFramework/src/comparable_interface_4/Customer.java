package comparable_interface_4;

/**
 * We can sort object by implementing Comparable interface.
 * 
 * But this Comparable interface is not very flexible. For example, here we are fixed comparaing by customers only with the name.
 * What if we need to compare with their email or address? 
 * Here, Comparator interface comes to the recuse.
 *
 */
public class Customer implements Comparable<Customer> {
	private String name;

	public Customer(String name) {
		super();
		this.name = name;
	}

	@Override
	public int compareTo(Customer o) {
		return name.compareTo(o.name);
	}
	
	@Override
	public String toString() {
		return name;
	}
}
