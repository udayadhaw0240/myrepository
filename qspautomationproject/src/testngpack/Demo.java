package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Demo {
	
	@Test
	public void A() 
	{
		Reporter.log("Demo class method",true);
	}

}
