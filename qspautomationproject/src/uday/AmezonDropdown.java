package uday;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class AmezonDropdown {

	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		WebElement dropdown = driver.findElement(By.id("searchDropdownBox"));
		Select sel = new Select(dropdown);
		sel.selectByIndex(5);
		
		
		
	}

}
