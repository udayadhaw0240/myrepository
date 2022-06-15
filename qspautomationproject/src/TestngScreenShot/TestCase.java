package TestngScreenShot;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

@Listeners(CustomListner.class)
public class TestCase extends BaseTest{
	
	@BeforeMethod
	public void setUp()
	{
		initialization();
	}
	
	@Test
	public void validLogin() throws InterruptedException
	{
		SoftAssert softassert = new SoftAssert();
		String actualLoginPageTitle = driver.getTitle();
		softassert.assertEquals(actualLoginPageTitle,"OrangeHRM");
		driver.findElement(By.name("txtUsername")).sendKeys("Admin");
		driver.findElement(By.name("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("btn/login")).click();
		
		WebElement dashboard = driver.findElement(By.xpath("//h1[.='dashboard']"));
		boolean statusofdashboard = dashboard.isDisplayed();
		Assert.assertEquals(statusofdashboard, true);
		Thread.sleep(4000);
	}
	
	@Test
	public void testcase2()
	{
		Assert.fail();
	}
	
	@Test
	public void testcase3()
	{
		Assert.fail();
	}

	@Test
	public void testcase4()
	{
		Assert.fail();
	}

	@Test
	public void testcase5()
	{
		Assert.fail();
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}


}
