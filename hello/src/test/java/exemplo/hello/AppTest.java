package exemplo.hello;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class AppTest 
{
	
	@Test
    public void testApp()
    {
		assertTrue( true );
    }
	
	@Test
	public void testreturnHello() {
		assertTrue(App.returnHello().equals("Hello World!"));		
	}
}
