package pageobjectmodel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	
	//declaration
	@FindBy(xpath="//a[.='Logout']") private WebElement logoutButton;
	@FindBy(id="SubmitTTButton") private WebElement saveButton;
	
	
	//initialization
	public HomePage(WebDriver driver) {
	PageFactory.initElements(driver, this);
	}
	
	
	//utilization
	public WebElement getLogoutButton() {
		return logoutButton;
	}
	public WebElement getSaveButton() {
		return saveButton;
	}
	
	//operational method
	public void clicklogout()
	{
		logoutButton.click();
	}
	
	
	public void clicksavebutton()
	{
		saveButton.click();
	}
	
}
