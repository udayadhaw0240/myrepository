package uday;



import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RedBusPage {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.redbus.in/");
		Thread.sleep(5000);
		
		driver.findElement(By.className("db")).sendKeys("Pune",Keys.ENTER);
		driver.findElement(By.id("dest")).sendKeys("Jalgaon",Keys.ENTER);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//td[text()='May 2022']")).click();
		driver.findElement(By.xpath("//td[text()='30']")).click();
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[.='Search Buses']")).click();
		
	
		
		
		
		
		
		
	}

}
