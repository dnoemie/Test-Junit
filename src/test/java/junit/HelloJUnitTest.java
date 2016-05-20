package junit;

import static org.junit.Assert.*;


import org.junit.Test;

public class HelloJUnitTest {

	@Test
	public void helloShouldReturnHello() {
		//GIVEN
		HelloJUnit helloJUnit = new HelloJUnit ();
		//WHEN
		String result = helloJUnit.hello();
		
		//THEN
		assertEquals("helloJUnit.hello() should equals hello", "hello", result);
		assertTrue("helloJUnit.hello() should equals hello", "hello".equals(result));
		//fail("Not yet implemented");
	}

}
