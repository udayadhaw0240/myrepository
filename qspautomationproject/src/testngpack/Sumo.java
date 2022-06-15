package testngpack;

import org.junit.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Sumo {
	
	@Test  
	public void C() 
	{
		Assert.fail();
		Reporter.log("Semo class method",true);
	}


}
