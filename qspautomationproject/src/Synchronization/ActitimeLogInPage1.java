package Synchronization;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeLogInPage1 {

	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.get("http://desktop-b0b06br/login.do");
		
		String actitimetitle = driver.getTitle();
		
		if(actitimetitle.equals("actiTIME - Login"))
		{
			System.out.println("The test case is passed! login page title match");
		}
		else
		{
			System.out.println("The test case is failed! login page title not match");
		}
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		String actitimehomepage = driver.getTitle();
		
		if(actitimehomepage.equals("actiTIME - Enter Time-Track"))
		{
			System.out.println("The test case is passed! home page title match");
		}
		else
		{
			System.out.println("The test case is failed! home page title not match");
		}
		
		

	}

}
