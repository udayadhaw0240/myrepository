package WebElementMethod;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelectedMethod {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	
		driver.get("http://desktop-b0b06br/login.do");
		
		WebElement selectbutton = driver.findElement(By.id("keepLoggedInLabel"));
		boolean status = selectbutton.isSelected();
		System.out.println(status);
		Thread.sleep(4000);
		
		selectbutton.click();
		boolean statu = selectbutton.isSelected();
		System.out.println(statu);
		
		
		
		
		
		
		
		
		
		
		
	}

}
