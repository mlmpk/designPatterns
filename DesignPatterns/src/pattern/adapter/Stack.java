package pattern.adapter;

/**
 * Exercise 11
 * demo stack interface
 * @author lempik00
 * @param <E>
 */
public interface Stack<E> {

	void push(E obj);
	E peek();
	E pop();
	boolean isEmpty();

}
