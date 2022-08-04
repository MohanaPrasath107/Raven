package Test;

// import org.junit.After;
// import org.junit.Before;
import org.junit.*;

public class Test1 {
	@Before
	public void beforeCase() {
	System.out.println("Welcome to Junit") ;
}
@Test
public void testCase() {
	System.out.println("This is test Case");
	
}
@After
public void AfterCase() {
	System.out.println("Thankyou");
}

}
