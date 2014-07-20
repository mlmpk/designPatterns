package pattern.strukturmuster.decorator;

public class BandbreiteKlein extends TarifDecorator {

	public BandbreiteKlein(Tarif t) {
		super(t);
	}
	
	@Override
	public int getGesamtpreis() {
		return 1 + tarif.getGesamtpreis();
	}

}
