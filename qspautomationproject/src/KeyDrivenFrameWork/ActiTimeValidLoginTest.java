package KeyDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeValidLoginTest extends BaseTest{

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		Flib flib = new Flib();
		
		
		String username = flib.readproperties("./data/conflic.properties", "username");
		String password = flib.readproperties("./data/conflic.properties", "password");
		
		bt.openbrowser();
		Thread.sleep(3000);
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		
		Thread.sleep(3000);
		
		bt.closebrowser();
		

	}

}
