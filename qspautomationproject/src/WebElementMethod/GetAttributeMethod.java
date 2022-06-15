package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		WebElement untTextBox = driver.findElement(By.name("txtUsername"));
		WebElement passTextBox = driver.findElement(By.name("txtPassword"));
		
		String value1 = untTextBox.getAttribute("id");
		String value2 = passTextBox.getAttribute("text");
		
		System.out.println(value1);
		System.out.println(value2);
		
		
		

	}

}
