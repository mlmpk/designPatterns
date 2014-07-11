package pattern.adapter;

/**
 * Exercise 11
 * demo (non functional) sequence class
 * @author lempik00
 * @param <E>
 */
public class Sequence<E> {

	@SuppressWarnings("unused")
	private Sequence<E> seq;
	
	public Sequence() {
		seq = new Sequence<>();
	}

	public int size() {
		return 0;
	}

	public E remove(int i) {
		return null;
	}

	public void add(E o) {
	}

}
