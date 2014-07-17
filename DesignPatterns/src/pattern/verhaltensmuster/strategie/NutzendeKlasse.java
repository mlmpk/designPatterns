package pattern.verhaltensmuster.strategie;

public class NutzendeKlasse {
	
	private String text;
	
	public NutzendeKlasse(String text) {
		this.text = text;
	}

	public void ersetze(Strategie s){
		
		System.out.println(s.strategieMethode(text));
		
	}
	
	
	
}
