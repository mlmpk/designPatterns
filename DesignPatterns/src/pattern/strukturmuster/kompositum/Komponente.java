package pattern.strukturmuster.kompositum;

public abstract class Komponente {
	
	protected String inhalt; 
	
	public abstract String get();
	public abstract void add(Komponente k);
	
}
