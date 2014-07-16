package pattern.kompositum.beispiel;

public class Application {

	
	public static void main(String[] args) {
		
		
		Kapitel kapitel1 = new Kapitel();
		Kapitel kapitel2 = new Kapitel();
		Kapitel kapitel3 = new Kapitel();
		Kapitel kapitel4 = new Kapitel();
		
		
		Foto foto1 = new Foto();
		Foto foto2 = new Foto();
		
		Tabelle tab1 = new Tabelle();
		
		Abbildung abb1 = new Abbildung();
		Abbildung abb2 = new Abbildung();
		Abbildung abb3 = new Abbildung();
		
		Text text1 = new Text();
		
		
		kapitel1.add(kapitel2);
		kapitel2.add(kapitel3);
		kapitel3.add(kapitel4);
		
		kapitel4.add(foto1);
		
		
		
		
		
		System.out.println(kapitel1.anzahlBilder());
		
		
		
	}
	
}
