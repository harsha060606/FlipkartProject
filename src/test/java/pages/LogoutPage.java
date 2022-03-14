package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
	

	@FindBy(xpath="//div[text()='My Account']") public WebElement Myaccount;
	@FindBy(xpath="//div[text()='Logout']") public WebElement logout;
	public LogoutPage(RemoteWebDriver driver) 
	{
	PageFactory.initElements(driver, this);		
	}
	public void clickmyaccount() throws Exception
	{
		Myaccount.click();
		Thread.sleep(2000);
	}
	public void clicklogout() throws Exception
	{
		logout.click();
		Thread.sleep(2000);
	}
}
