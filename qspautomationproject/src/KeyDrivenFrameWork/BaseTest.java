package KeyDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoInterface {

	static WebDriver driver;
	
	//method to open the browser
	public void openbrowser() throws IOException
	{
		Flib flib = new Flib();
		String value = flib.readproperties("./data/conflic.properties", "browser");
		
		//read the data from property file
		String url = flib.readproperties("./data/conflic.properties", "url");
		
		//use the value of browser
		
		if(value.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		}
		else if(value.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecho.driver", "./drivers/gechodriver.exe");
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get(url);
			driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
			
		}
		else
		{
			System.out.println("enter the valid choice");
		}
		
	}
	
	//method to close the browser
	public void closebrowser()
	{
		driver.quit();
	}

}
