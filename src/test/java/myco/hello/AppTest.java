package myco.hello;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;



@RunWith(JUnitPlatform.class)
public class AppTest {
	
	@Test	
	public void sayHello() {
		assertTrue(true);
		
	}

}
