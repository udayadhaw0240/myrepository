package KeyDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLoginTest  extends BaseTest {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		int rc = flib.getRowcount("./data/ActiTimeLogin.xlsx", "invalidcreads");
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 0);
			String password = flib.readExcelData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(3000);
			driver.findElement(By.name("username")).clear();
			
		}
		
		bt.closebrowser();
		

	}

}
