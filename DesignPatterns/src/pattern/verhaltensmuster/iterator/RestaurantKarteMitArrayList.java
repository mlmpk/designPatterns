package pattern.verhaltensmuster.iterator;

import java.util.ArrayList;
import java.util.Iterator;

public class RestaurantKarteMitArrayList implements Iterable {

	ArrayList<Speise> liste;
	
	public RestaurantKarteMitArrayList() {
		liste = new ArrayList<Speise>();
		
		liste.add(new Speise("Wildgulasch", 18.50));
		liste.add(new Speise("Currywurst mit Pommes", 4.50));
		liste.add(new Speise("Geschnetzeltes", 11.50));
		
	}
	
	@Override
	public Iterator<Speise> iterator() {
		return liste.iterator();
	}

}
