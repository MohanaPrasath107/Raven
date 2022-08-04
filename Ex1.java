package Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.*;

public class Ex1 {
	
	
	
	Maxi maxi = new Maxi() ;
	@Test
	public void max() {
		String[] as = {"Kiruba","Mohanaprasath","Ashok"};
		String a = "MOHANAPRASATH" ;
		assertEquals(maxi.maxLength(as), a);
		assertNotNull(maxi.maxLength(as));
	}
		
}
