package pattern.strukturmuster.kompositum;

public class Atom extends Komponente {

	
	public Atom(String s) {
		inhalt = s;
	}
	
	@Override
	public String get() {
		return inhalt;
	}
	
	@Override
	public void add(Komponente k) {
		
		
	}

}
