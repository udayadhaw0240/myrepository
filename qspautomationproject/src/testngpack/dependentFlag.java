package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependentFlag {


	@Test(groups="FUNCTIONAL")
	public void ft1()
	{
		Reporter.log("ft1",true);
	}
	
	@Test()
	public void st1()
	{
		Reporter.log("st1",true);
	}
	
	@Test
	public void it1()
	{
		Reporter.log("it1",true);
	}

}
