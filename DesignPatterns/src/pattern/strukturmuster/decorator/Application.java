package pattern.strukturmuster.decorator;

public class Application {

	
	public static void main(String[] args) {
		
		Tarif meinTarif = new BandbreiteKlein(new BandbreiteKlein(new Basis()));
		
		System.out.println(meinTarif.getGesamtpreis());
		
		
	}
}
