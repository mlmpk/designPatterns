package pattern.erzeugungsmuster.singleton;

public class Application {

	public static void main(String[] args) {
		

		Singleton singleton = Singleton.getInstance();
		
		singleton.setInhalt("Test");
		
		Singleton otherSingleton = Singleton.getInstance();
		System.out.println(otherSingleton.getInhalt());

	}

}
