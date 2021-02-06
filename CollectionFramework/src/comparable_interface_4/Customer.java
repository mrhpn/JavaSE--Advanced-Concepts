package comparable_interface_4;

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
