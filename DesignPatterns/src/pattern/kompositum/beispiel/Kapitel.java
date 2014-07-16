package pattern.kompositum.beispiel;

import java.util.ArrayList;

public class Kapitel extends Bestandteil {

	ArrayList<Bestandteil> liste = new ArrayList<>();
	
	@Override
	public int anzahlBilder() {
	
		int sum = 0;
		
		for (Bestandteil b : liste) {
			sum += b.anzahlBilder();
		}
		
		return sum;
	}

	public void add(Bestandteil b){
		
		liste.add(b);
		
	}
	
	
}
