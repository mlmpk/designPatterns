package pattern.adapter;

public class SequenceStackObjectAdapter<E> implements Stack<E> {

	private Sequence<E> seq;
	
	public SequenceStackObjectAdapter(){
		seq = new Sequence<>();
	}
	
	@Override
	public void push(E obj) {
		seq.add(obj);
	}

	@Override
	public E peek() {
		E element = seq.remove(seq.size()-1);
		seq.add(element);
		return element;
	}

	@Override
	public E pop() {
		return seq.remove(seq.size()-1);
	}

	@Override
	public boolean isEmpty() {
		return seq.size() == 0;
	}

}
