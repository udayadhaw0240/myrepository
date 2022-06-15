package methodsOfWebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/HTML/textbox2.html");
		
		WebElement usernameTextBox = driver.findElement(By.name("n1"));
		usernameTextBox.sendKeys("udayadhaw");
		System.out.println(usernameTextBox);
		WebElement passwordTextBox = driver.findElement(By.name("p1"));
		passwordTextBox.sendKeys("12365");
		

	}

}
