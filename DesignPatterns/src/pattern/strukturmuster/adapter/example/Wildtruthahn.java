package pattern.strukturmuster.adapter.example;

public class Wildtruthahn implements Truthahn {

	@Override
	public void kollern() {
		System.out.println("Koller, koller !");
	}

	@Override
	public void fliegen() {
		System.out.println("Ich kann nur kurze St??cke fliegen! :( ");
	}

}
