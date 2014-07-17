package pattern.verhaltensmuster.iterator;

import java.util.Iterator;

public class RestaurantKarteMitArray implements Iterable {

	private Speise[] liste = new Speise[10];	
	private int anzahlSpeisen;
	
	public RestaurantKarteMitArray() {
		
		speiseHinzufuegen(new Speise("Wildgulasch", 12.50));
		speiseHinzufuegen(new Speise("Currywurst mit Pommes", 5.50));
		speiseHinzufuegen(new Speise("Geschnetzeltes", 9.50));
		
	}
	
	@Override
	public Iterator<Speise> iterator() {
	
		return new RestaurantKarteArrayIterator(liste);
	}

	public boolean speiseHinzufuegen(Speise speise){
		if(speisekarteNichtVoll()){
			liste[anzahlSpeisen++] = speise;
			return true;
		}else{
			System.out.println("Speisekarte voll! Sorry!");
			return false;
		}
	}
	
	public boolean speisekarteNichtVoll(){
		return anzahlSpeisen < liste.length;
	}
	
}
