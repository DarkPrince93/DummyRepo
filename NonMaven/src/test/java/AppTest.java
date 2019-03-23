import static org.junit.Assert.*;

import org.junit.Test;

public class AppTest {

	@Test
	public void test() {
		new App().main(new String[]{"Hello"});
		assertEquals(true, true);
	}
	
}
