package Test;

import org.junit.*;

public class MathTest {
	Maths math = new Maths();
	@Test
	public void addCase() {
		math.add(21,10);
	}
	@Test
	public void subCase() {
		math.sub(30, 20);
	}
	@Test
	public void mulCase() {
		math.mul(5, 6);
	}
	@Test
	public void divCase() {
		math.div(58, 2);
	}

}
