package pattern.verhaltensmuster.strategie;

public class ErsetzeLStrategie implements Strategie{

	@Override
	public String strategieMethode(String s) {
		
		System.out.println("Ersetze alle vorkommenden L durch S");
		
		s = s.replace('l', 's');
		
		return s;
	}

}
