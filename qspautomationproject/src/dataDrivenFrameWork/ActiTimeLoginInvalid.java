package dataDrivenFrameWork;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActiTimeLoginInvalid {

	public static void main(String[] args) throws InterruptedException, EncryptedDocumentException, IOException {
		
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.get("http://desktop-b0b06br/login.do");
		Thread.sleep(4000);

		flib flib = new flib();
		int rc = flib.getRowCount("./data/ActiTimeLogin.xlsx", "invalidcreads");
		
		for(int i=1; i<=rc; i++)
		{
			
			String username = flib.readData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 0);
			String password = flib.readData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
			
		}
	}

}
