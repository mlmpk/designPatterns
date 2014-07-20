package pattern.strukturmuster.adapter.example;

/**
 * ObjektAdapter
 * @author lempik00
 *
 */
public class TruthahnAdapter implements Ente{

	Truthahn truthahn;
	
	public TruthahnAdapter(Truthahn truthahn){
		this.truthahn = truthahn;
	}
	
	@Override
	public void schnattern() {
		truthahn.kollern();

	}

	@Override
	public void fliegen() {
		truthahn.fliegen();
	}

}
