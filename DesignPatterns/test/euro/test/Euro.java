package euro.test;


public class Euro {

	private double amount;
	private int pin;
	
	public Euro(double a) {
		amount = a;
	}
	public double getAmount() {
		return amount;
	}

	public Euro add(Euro e){
		return new Euro(2);
	}
		
}
