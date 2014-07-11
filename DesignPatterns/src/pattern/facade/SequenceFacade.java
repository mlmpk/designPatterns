package pattern.facade;

import pattern.adapter.Sequence;

public class SequenceFacade<E> {
	private Sequence<E> seq;
	private int addCounter;
	private int removeCounter;
	private int replaceCounter;
	
	
	
	public SequenceFacade(Sequence<E> seq) {
		this.seq = seq;
		addCounter = 0;
		removeCounter = 0;
		replaceCounter = 0;
	}
	
	public void addElement(E element){
		seq.add(element);
		addCounter++;
	}
	
	public E removeFirst(){
		removeCounter++;
		return seq.remove(0);
	}
	
	public void replaceLast(E element) {
		seq.remove(seq.size()-1);
		seq.add(element);
		replaceCounter++;
	}
	
	public int getCountAddElement(){
		return addCounter;
	}
	
	public int getCountRemoveFirst(){
		return removeCounter;
	}
	public int getCountReplace(){
		return replaceCounter;
	}
	
	
}
