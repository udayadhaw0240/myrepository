package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropBoxLogInPage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.dropbox.com/login");
		driver.findElement(By.name("login_email")).sendKeys("udayadhawa@6504");
		driver.findElement(By.name("login_password")).sendKeys("65214mnbh");
		driver.findElement(By.className("login-button signin-button button-primary")).click();

	}

}
