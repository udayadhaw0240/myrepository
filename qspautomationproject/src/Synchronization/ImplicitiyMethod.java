package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitiyMethod {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("https://www.instagram.com");
		
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("udayadhaw");
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("uday6504");
		driver.findElement(By.cssSelector("button[class*='L3NKy   ']")).click();
		
		
	}
	
}
