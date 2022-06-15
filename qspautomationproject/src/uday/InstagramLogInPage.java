package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstagramLogInPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/");
		
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name*='username']")).sendKeys("udayadhaw");
		driver.findElement(By.cssSelector("input[name*='password']")).sendKeys("uday6504");
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("button[class*='L3NKy   ']")).click();

	}

}
