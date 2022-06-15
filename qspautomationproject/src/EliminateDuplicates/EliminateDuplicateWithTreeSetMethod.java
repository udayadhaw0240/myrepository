package EliminateDuplicates;

import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EliminateDuplicateWithTreeSetMethod {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/hp/Desktop/HTML/drop1.html");
		
		WebElement dropdown = driver.findElement(By.id("menu"));
		Select sel = new Select(dropdown);
		List<WebElement> options = sel.getOptions();
		
		TreeSet<String> s=new TreeSet<String>();
		
		for(int i=0;i<options.size();i++)
		{
			WebElement ops = options.get(i);
			String text = ops.getText();
			s.add(text);
		}
		
		for(String se:s)
		{
			System.out.println(se);
		}

	}

}
