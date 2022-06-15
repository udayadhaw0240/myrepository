package testngpack;

import static org.testng.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class AssertionOrangeHRM {
	WebDriver driver;
	
	@BeforeTest
	public void setProperty()
	{
		System.setProperty("webdriver.chroe.driver","./drivers/chromedriver.exe");
		
	}

	@BeforeMethod
	public void launchTheBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://opensource-emo.orangehrmlive.com/");
	}

	
	@Test
	public void testCase() throws InterruptedException
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
		
		String actualHomePageTitle = driver.getTitle();
		softassert.assertEquals(actualHomePageTitle,"OrangrHRMHomePage");
		Reporter.log("create User",true);
		Reporter.log("create contact",true);
		softassert.assertAll();
	}

}
