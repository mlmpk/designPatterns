package pattern.adapter.example;

/**
 * Spezielle Realisierung einer Ente
 * @author lempik00
 *
 */
public class Stockente implements Ente {

	@Override
	public void schnattern() {
		System.out.println("Quak !");
	}

	@Override
	public void fliegen() {
		System.out.println("Ich kann lange fliegen!");

	}

}
