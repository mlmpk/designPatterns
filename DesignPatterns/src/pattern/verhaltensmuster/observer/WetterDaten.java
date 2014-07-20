package pattern.verhaltensmuster.observer;

import java.util.Observable;

public class WetterDaten extends Observable {

	private float temp;
	private float humidity;
	private float pressure;

	public void messwerteGeaendert() {
		setChanged();
		notifyObservers();
	}

	// --- getters / setters ---

	public void setMesswerte(float temp, float humidity, float pressure) {
		this.temp = temp;
		this.humidity = humidity;
		this.pressure = pressure;
		messwerteGeaendert();
	}

	public float getTemp() {
		return temp;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}

}
