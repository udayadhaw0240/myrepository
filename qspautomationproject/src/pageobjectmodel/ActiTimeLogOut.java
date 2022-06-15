package pageobjectmodel;

import java.io.IOException;

public class ActiTimeLogOut extends BaseTest{

	public static void main(String[] args) throws IOException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		Flib flib = new Flib();
		
		String validUsername = flib.readPropertyFile("./data/conflic.properties", "username");
		String validPassword = flib.readPropertyFile("./data/conflic.properties", "password");
		LoginPage lp = new LoginPage(driver);
		lp.actiTimeValidLogin(validUsername, validPassword);
		
		HomePage hp = new HomePage(driver);
		hp.clicklogout();
	
	}

}
