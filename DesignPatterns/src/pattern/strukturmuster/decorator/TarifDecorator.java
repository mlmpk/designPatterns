package pattern.strukturmuster.decorator;

public abstract class TarifDecorator implements Tarif {

	protected Tarif tarif;
	
	public TarifDecorator(Tarif t) {
		tarif = t;
	}
	
	public abstract int getGesamtpreis();

}
