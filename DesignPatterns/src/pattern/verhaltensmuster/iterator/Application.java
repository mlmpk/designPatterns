package pattern.verhaltensmuster.iterator;

import java.util.Iterator;

public class Application {

	public static void main(String[] args) {
		RestaurantKarteMitArray speisekarte1 = new RestaurantKarteMitArray();
		RestaurantKarteMitArrayList speisekarte2 = new RestaurantKarteMitArrayList();
		
		Iterator<?> speisekarte1Iterator = speisekarte1.iterator();
		Iterator<?> speisekarte2Iterator = speisekarte2.iterator();
		System.out.println("Speisekarte Restaurant zum leckeren Array:");
		System.out.println("-------------------------------------------------");
		speiseKarteAusgeben(speisekarte1Iterator);
		System.out.println();
		System.out.println("Speisekarte Restaurant zur schnittigen ArrayList:");
		System.out.println("-------------------------------------------------");
		speiseKarteAusgeben(speisekarte2Iterator);
		
		
	}
	
	
	private static void speiseKarteAusgeben(Iterator<?> iter){
		
		while(iter.hasNext()){
			Speise speise = (Speise) iter.next();
			System.out.println("Speise: "+speise.getBezeichnung()+ " - Preis: "+speise.getPreis());
		}
		
	}
	
	
	
}
