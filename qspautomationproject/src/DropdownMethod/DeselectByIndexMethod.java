package DropdownMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DeselectByIndexMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/HTML/drop1.html");
		
		WebElement singledropdowm = driver.findElement(By.id("menu"));
		Select sel = new Select(singledropdowm);
		sel.selectByIndex(5);
		Thread.sleep(2000);
		sel.deselectByIndex(5);
		
	}

}
