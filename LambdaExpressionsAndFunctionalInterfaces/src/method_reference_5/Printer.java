package method_reference_5;

/**
 * Functional Interface 
 * ----- 
 * An interface which has only a single abstract method
 * 
 * As long as an interface has only single abstract method, no matter it has other default and static methods in it, we refer to that interface as
 * functional interface.
 * 
 */
@FunctionalInterface
public interface Printer {
	void print(String message);
}
