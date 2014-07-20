package pattern.strukturmuster.kompositum;

public class TestKompositum {

	
	public static void main(String[] args) {
		
		
		Atom einAtom = new Atom("bla");
		
		Komposition eineKomposition = new Komposition("kompo");
		Komposition zweiteKomposition = new Komposition("kompo 2");
		
		eineKomposition.add(zweiteKomposition);
		zweiteKomposition.add(new Atom("!Lampik"));
		eineKomposition.add(einAtom);
		
		System.out.println(eineKomposition.get());
		
		
	}
	
}
