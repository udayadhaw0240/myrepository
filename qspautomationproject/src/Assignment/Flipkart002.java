package Assignment;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart002 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()='Fashion']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[@class='_6WOcW9 _2-k99T']"));
		Thread.sleep(2000);
		List<WebElement> suggestions = driver.findElements(By.xpath("//a[@class='_6WOcW9 _3YpNQe']"));
		 
		 for(WebElement sugg:suggestions)
		 {
			 String textOfTheWebelement = sugg.getText();
			 System.out.println(textOfTheWebelement);
		 }
	}

}
