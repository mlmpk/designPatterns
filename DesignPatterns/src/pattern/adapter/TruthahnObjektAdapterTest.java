package pattern.adapter;

import pattern.adapter.example.Ente;
import pattern.adapter.example.Stockente;
import pattern.adapter.example.TruthahnAdapter;
import pattern.adapter.example.Wildtruthahn;

public class TruthahnObjektAdapterTest {
	
	public static void main(String[] args) {
		
		Stockente stockente = new Stockente();
		
		stockente.schnattern();
		stockente.fliegen();
		
		Wildtruthahn wildtruthahn = new Wildtruthahn();
		
		wildtruthahn.kollern();
		wildtruthahn.fliegen();
		
		
		TruthahnAdapter truthahnImEntenGewand = new TruthahnAdapter(wildtruthahn);
		
		testeEnte(stockente);
		testeEnte(truthahnImEntenGewand);
				
		
	}
	
	
	public static void testeEnte (Ente ente){
		System.out.println("------- Teste Ente -------");
		ente.schnattern();
		ente.fliegen();
	}
	

}
