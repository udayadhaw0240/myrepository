package OperationalMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetWrappedMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/HTML/drop1.html");
		
		WebElement dropdowntext = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdowntext);
		WebElement alltext = sel.getWrappedElement();
		String allops = alltext.getText();
		System.out.println(allops);
		
		
		
		
		
		
	}

}
