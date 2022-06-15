package Assignment;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsAndRobot2 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[.='Downloads']")).click();
		
		WebElement target = driver.findElement(By.xpath("//h1[.='Downloads']"));
		Actions act=new Actions(driver);
		act.contextClick(target).perform();
		
		Thread.sleep(4000);
		Robot robot = new Robot();
		
		for(int i=0;i<=9;i++)
		{
			robot.keyPress(KeyEvent.VK_DOWN);
			Thread.sleep(2000);
			robot.keyRelease(KeyEvent.VK_DOWN);
		}
		Thread.sleep(4000);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);

	}

}
