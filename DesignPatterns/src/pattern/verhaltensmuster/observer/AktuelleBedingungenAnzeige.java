package pattern.verhaltensmuster.observer;

import java.util.Observable;
import java.util.Observer;

public class AktuelleBedingungenAnzeige implements Observer {

	Observable observable;
	private float temp;
	private float humidity;
	
	public AktuelleBedingungenAnzeige(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}
	
	@Override
	public void update(Observable o, Object arg) {
		
		if(o instanceof WetterDaten){
			WetterDaten wetterDaten = (WetterDaten) o;
			this.temp = wetterDaten.getTemp();
			this.humidity = wetterDaten.getHumidity();
			anzeigen();
		}

	}

	public void anzeigen() {
		System.out.println("Aktuelle Bedingungen: "+ temp + " Grad C und "+ humidity + " % Luftfeuchtigkeit");
	}
	
}
