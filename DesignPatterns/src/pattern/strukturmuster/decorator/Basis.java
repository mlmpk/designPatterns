package pattern.strukturmuster.decorator;

public class Basis implements Tarif {

	@Override
	public int getGesamtpreis() {
		return 20;
	}

}
