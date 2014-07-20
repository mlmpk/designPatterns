package euro.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;

public class EuroTest {
	
	@Test
	public void testAmount(){
		
		Euro two = new Euro(2.0);
		
		assertEquals(2.0, two.getAmount(),0.00);
	
		
	}
	
	public static void main(String[] args) {
		JUnitCore.runClasses(EuroTest.class);
	}
	
}
