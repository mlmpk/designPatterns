package pattern.verhaltensmuster.observer;

public class Wetterstation {
	
	public static void main(String[] args) {
		WetterDaten wetterDaten = new WetterDaten();
		AktuelleBedingungenAnzeige anzeige = new  AktuelleBedingungenAnzeige(wetterDaten);
		
		wetterDaten.setMesswerte(30, 65, 30.4f);
		wetterDaten.setMesswerte(32, 70, 29.2f);
		wetterDaten.setMesswerte(28, 90, 29.2f);
		
		wetterDaten.deleteObserver(anzeige);
		wetterDaten.setMesswerte(25, 90, 29.2f);
	}

}
