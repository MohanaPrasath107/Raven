package Test;


import static org.junit.Assert.*;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.*;

public class Assert1 {
	String a = "Mohan";
	String b = "Mohan";
	String c = "Kiruba";
	String d = null;
	boolean is = 10>5;
	boolean no = 5>6;
	String[] ab = {"kiruba","mohan"};
	String[] ba = {"kiruba","mohan"};

	@Test
	public void assertEqua(){
		assertEquals(a,b);
	}
	
	@Test
	public void assertNotE() {
		assertNotEquals(a,c);
	}
	@Test
	public void assertNul() {
		assertNull(d);
	}
	
	@Test
	public void assertNotNul() {
		assertNotNull(c);
	}
	
	@Test
	public void assertSamee() {
		assertSame(b, a);
	}
	
	@Test
	public void assertNotSamee() {
		assertNotSame(c, a);
	}
	
	@Test
	public void assertTruee() {
		assertTrue(is);
	}
	
	@Test
	public void assertFalsee() {
		assertFalse(no);
	}
	
	@Test
	public void assertArrayEqual() {
		assertArrayEquals(ab, ab);
	}
	

}
