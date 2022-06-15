package MouseHoverAction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		WebElement src = driver.findElement(By.xpath("//a[.=' BANK ']"));
		WebElement target = driver.findElement(By.id("bank"));
		
		Thread.sleep(4000);
		Actions act = new Actions(driver);
		act.dragAndDrop(src, target).perform();
		

	}

}
