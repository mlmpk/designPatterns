package pattern.verhaltensmuster.strategie;

public class Application {

	public static void main(String[] args) {
		
		
		NutzendeKlasse klasse = new NutzendeKlasse("Hallo Welt!");
		
		Strategie s = new ErsetzeLStrategie();
		klasse.ersetze(s);
		
		s = new ErsetzeWeltStrategie();
		
		klasse.ersetze(s);

	}

}
