package testngpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class testngPriority{
	
	@Test
	public void Q()
	{
		Reporter.log("Z",true);
	}

	@Test
	public void H()
	{
		Reporter.log("H",true);
	}

	@Test
	public void K()
	{
		Reporter.log("K",true);
	}

	@Test
	public void M()
	{
		Reporter.log("M",true);
	}

	@Test
	public void B()
	{
		Reporter.log("B",true);
	}

	@Test
	public void Z()
	{
		Reporter.log("Z",true);
	}

	@Test
	public void Z()
	{
		Reporter.log("Z",true);
	}

}
