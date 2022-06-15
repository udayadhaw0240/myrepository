package uday;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MethodCurrentUrl {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource.orangehrmlive.com");
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);
	}

}
