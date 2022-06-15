package xpathCase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Case4Syntax2 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://in.puma.com/in/en/home");
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@placeholder='Search puma.com' and contains(@class,'validated ')]")).sendKeys("shoes");
	}

}
