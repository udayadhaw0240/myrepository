package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EmailLogInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://webmail.au.syrahost.com/");
		driver.findElement(By.name("login")).sendKeys("adhawuday24@email.com");
		driver.findElement(By.name("password")).sendKeys("352145012");
		driver.findElement(By.id("sign_in")).click();

	}

}
