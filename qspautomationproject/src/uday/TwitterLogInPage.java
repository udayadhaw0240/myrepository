package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TwitterLogInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://twitter.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//span[contains(text(),' phone')]")).click();
		driver.findElement(By.name("name")).sendKeys("udayadhaw");
		Thread.sleep(2000);
		driver.findElement(By.name("phone_number")).sendKeys("1234567890");
		driver.findElement(By.id("SELECTOR_1")).sendKeys("March",Keys.ENTER);
		driver.findElement(By.id("SELECTOR_2")).sendKeys("10");
	}

}
