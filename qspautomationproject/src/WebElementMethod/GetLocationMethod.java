package WebElementMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocationMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/");
		
		WebElement news = driver.findElement(By.xpath("//h2[.='News']"));
		Point loc = news.getLocation();
		int xaxis = loc.getX();
		int yaxis = loc.getY();
		
		System.out.println(xaxis);
		System.out.println(yaxis);
		
		
		
	}

}
