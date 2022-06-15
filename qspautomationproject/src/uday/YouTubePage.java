package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YouTubePage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.youtube.com/");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@id='search']")).sendKeys("sher shivraj trailer");
		driver.findElement(By.id("search-icon-legacy")).click();
		driver.findElement(By.xpath("//yt-formatted-string[text()='Sher Shivraj (शेर शिवराज) - TRAILER | Chinmay M | Mrinal K | Ajay P | Mukesh Rishi | Digpal Lanjekar']")).click();
	}

}
