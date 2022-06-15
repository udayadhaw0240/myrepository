package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	//declaration
	@FindBy(name="username") private WebElement usn;
	@FindBy(name="pwd") private WebElement pass;
	@FindBy(id="loginButton") private WebElement loginButton;
	@FindBy(id="keepLoggedInLabel") private WebElement keepLoggedInLabel;
	@FindBy(xpath="//img[contains(@src,'timer')]") private WebElement logo;
	
	
	
	
	
	//initialization
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	
	public WebElement getUsn() {
		return usn;
	}
	
	public WebElement getPass() {
		return pass;
	}
	public WebElement getLoginButton() {
		return loginButton;
	}
	public WebElement getKeepLoggedInLabel() {
		return keepLoggedInLabel;
	}
	public WebElement getLogo() {
		return logo;
	}
	
	
	
	//generic reusable method
	
	public void actiTimeValidLogin(String validUsername,String validPassword) 
	{
		
		usn.sendKeys(validUsername);
		pass.sendKeys(validPassword);
		loginButton.click();
	}
	
	public void actiTimeInvalidLogin(String invalidUsername, String invalidPassword)
	{
		usn.sendKeys(invalidUsername);
		pass.sendKeys(invalidPassword);
		loginButton.click();
		usn.clear();
	}
	
	
	
	
	
	
	//operational method

}
