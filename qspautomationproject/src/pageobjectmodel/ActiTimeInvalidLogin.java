package pageobjectmodel;

import java.io.IOException;

public class ActiTimeInvalidLogin extends BaseTest {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		Thread.sleep(3000);
		
		Flib flib = new Flib();
		LoginPage lp = new LoginPage(driver);
		int rc = flib.getRowCount("./data/ActiTimeLogin.xlsx", "invalidcreads");
		
		for(int i=1;i<=rc;i++)
		{
			String invalidUsername = flib.readExcelData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 0);
			String invalidPassword = flib.readExcelData("./data/ActiTimeLogin.xlsx", "invalidcreads", i, 1);
			lp.actiTimeInvalidLogin(invalidUsername, invalidPassword);
		}
	}

}
