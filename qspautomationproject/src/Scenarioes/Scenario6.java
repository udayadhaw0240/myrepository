package Scenarioes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scenario6 {

		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.bluestone.com/");
			Thread.sleep(3000);
			driver.findElement(By.id("denyBtn")).click();
			
			WebElement target = driver.findElement(By.xpath("//li[@class='menuparent repb']/a[@title='Rings']"));
			Actions act = new Actions(driver);
			act.moveToElement(target).perform();
			
			driver.findElement(By.xpath("(//a[.='Diamond'])[1]")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//span[.=' Popular '] ")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("//a[.='Price Low to High '] ")).click();
			driver.close();
			

	}

}
