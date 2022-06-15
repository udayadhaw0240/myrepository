package Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartLaptop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.name("q")).sendKeys("laptop");
		driver.findElement(By.className("L0Z3Pu")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_24_Dny']/following-sibling::div[.='Core i5']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[.='Brand']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_30VH1S']/following-sibling::div[.='HP']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='_213eRC _2ssEMF']/descendant::div[.='Operating System']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@class='_30VH1S']/following-sibling::div[.='Windows 10']")).click();
		Thread.sleep(4000);
		String laptopname = driver.findElement(By.xpath("(//div[@class='_4rR01T']/ancestor::a[@class='_1fQZEK'])[1]")).getText();
		
		System.out.println(laptopname);
	}

}
