package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy(xpath="(//button[@type='submit'])[2]") public WebElement loginbutton;
	public LoginPage(RemoteWebDriver driver) 
	{
	PageFactory.initElements(driver, this);		
	}
	public void ClickloginButton() throws Exception
	{
		loginbutton.click();
		Thread.sleep(5000);
	}
}
