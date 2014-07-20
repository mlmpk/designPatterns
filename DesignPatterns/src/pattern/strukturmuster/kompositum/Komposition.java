package pattern.strukturmuster.kompositum;

import java.util.ArrayList;

public class Komposition extends Komponente {

	private ArrayList<Komponente> kinder = new ArrayList<>();
	
	public Komposition(String s) {
		inhalt = s;
	}
		
	@Override
	public void add(Komponente k) {
		kinder.add(k);
		
	}
	@Override
	public String get() {
		String alleInhalte = inhalt;
		for (Komponente k : kinder) {
			alleInhalte += k.get();
		}
		return alleInhalte;
	}
	

}
