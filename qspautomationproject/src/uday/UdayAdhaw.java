package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UdayAdhaw {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/?hl=en");
		driver.findElement(By.name("username")).sendKeys("udayadhaw",Keys.ENTER);
		driver.findElement(By.name("password")).sendKeys("125428541",Keys.ENTER);
		driver.findElement(By.className("sqdOP  L3NKy   y3zKF     ")).click();
		
		

	}

}
