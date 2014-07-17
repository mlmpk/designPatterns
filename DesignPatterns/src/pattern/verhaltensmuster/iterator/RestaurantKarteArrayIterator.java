package pattern.verhaltensmuster.iterator;

import java.util.Iterator;

public class RestaurantKarteArrayIterator implements Iterator<Speise> {

	Speise [] speisen;
	private int currentPosition;
	
	public RestaurantKarteArrayIterator(Speise[] speisen) {
		this.speisen = speisen;
		currentPosition = 0;
	}
	
	@Override
	public boolean hasNext() {
		if(currentPosition >= speisen.length || speisen[currentPosition] == null ){
			return false;
		}else{
			return true;
		}
	}

	@Override
	public Speise next() {
		return speisen[currentPosition++];
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
