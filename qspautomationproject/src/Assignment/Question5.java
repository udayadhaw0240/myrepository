package Assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Question5 {

	public static void main(String[] args) {
		//perform action (maximize) on any child window ?
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://omayo.blogspot.com/");
		driver.findElement(By.linkText("Open a popup window")).click();
		
		String parentTitle = driver.getTitle();
		
		
		Set<String> allHandle = driver.getWindowHandles();
		
		for(String wh:allHandle)
		{
			String currentTitle = driver.switchTo().window(wh).getTitle();
			if(!parentTitle.equals(currentTitle))
			{
				driver.switchTo().window(wh).manage().window().maximize();
			}
			else
			{
				driver.switchTo().window(wh).close();
			}
		}

	}

}
