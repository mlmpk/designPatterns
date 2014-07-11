package pattern.adapter;

 /**
 * Exercise 11
 * demo (non functional) SequenceStackAdapter class
 * class adapter
 * @author lempik00
 * @param <E>
 */
public class SequenceStackClassAdapter<E> extends Sequence<E> implements Stack<E> {

	@Override
	public void push(E obj) {
		add(obj);
	}

	@Override
	public E peek() {
		E element = remove(size()-1);
		add(element);
		return element;
	}

	@Override
	public E pop() {
		return remove(size() - 1);
	}

	@Override
	public boolean isEmpty() {
		return size() == 0;
	}

}