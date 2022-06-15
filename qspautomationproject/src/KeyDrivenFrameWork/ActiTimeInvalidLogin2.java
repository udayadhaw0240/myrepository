package KeyDrivenFrameWork;

import java.io.IOException;

import org.openqa.selenium.By;

public class ActiTimeInvalidLogin2 extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		
		BaseTest bt = new BaseTest();
		bt.openbrowser();
		
		Flib flib = new Flib();
		int rc = flib.getRowcount(EXCEL_PATH, "invalidcreads");
		
		for(int i=1;i<=rc;i++)
		{
			String username = flib.readExcelData(EXCEL_PATH, "invalidcreads", i,0);
			String password = flib.readExcelData(EXCEL_PATH, "invalidcreads", i,1);
			driver.findElement(By.name("username")).sendKeys(username);
			driver.findElement(By.name("pwd")).sendKeys(password);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(2000);
			driver.findElement(By.name("username")).clear();
		}
		
		
		bt.closebrowser();
		
		

	}

}
