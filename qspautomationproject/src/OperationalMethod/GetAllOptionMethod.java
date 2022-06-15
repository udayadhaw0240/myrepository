package OperationalMethod;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetAllOptionMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/HTML/drop1.html");
		
		WebElement dropdown=driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		for(int i=0;i<=5;i++)
		{
			sel.selectByIndex(i);
		}
		
		List<WebElement> alltext=sel.getAllSelectedOptions();
		
		for(WebElement allops:alltext)
		{
			String ops = allops.getText();
			System.out.println(ops);
		}

	}

}
