package pattern.verhaltensmuster.strategie;

public class ErsetzeWeltStrategie implements Strategie {

	@Override
	public String strategieMethode(String s) {
		
		System.out.println("Ersetze Welt durch World");
		
		s = s.replace("Welt", "World");
		
		return s;
	}

}
