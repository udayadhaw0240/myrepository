package uday;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class AmezonSignInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iPhone 13");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		
		driver.findElement(By.xpath("(//span[.='Apple iPhone 13 (128GB) - Midnight'])[3]")).click();
		Thread.sleep(2000);
		
		String parentHandle = driver.getWindowHandle();
		Set<String> allhandle = driver.getWindowHandles();
		
		for(String wh:allhandle)
		{
			if(!parentHandle.equals(wh))
			{
				driver.switchTo().window(wh);
			}
			else
			{
				
			}
			
		}
		
		driver.findElement(By.id("buy-now-button")).click();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
