package Synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actititmeloginpage2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("");
		
	//	WebDriverWait waitfortime = new WebDriverWait(driver, 30);
		//waitfortime.until(ExpectedConditions.titleContains("Login"));
		System.out.println("the login page is varified");
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
	//	waitfortime.until(ExpectedConditions.titleContains("Enter"));
		System.out.println("the home page is verifird");
		

	}

}
