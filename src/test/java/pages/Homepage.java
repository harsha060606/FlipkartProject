package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage 
{
	
@FindBy(linkText="Login") public WebElement login;
@FindBy(xpath="(//input[@type='text'])[2]") public WebElement username;
@FindBy(xpath="//input[@type='password']") public WebElement password;


public Homepage(RemoteWebDriver driver) 
{
PageFactory.initElements(driver, this);		
}
public void FlipkartLogin() throws Exception
{
	Thread.sleep(5000);
	//login.click();
	//Thread.sleep(2000);
}
public void FillUsername(String un) throws Exception
{
	username.sendKeys(un);
	Thread.sleep(2000);
}
public void FillPassword(String pw) throws Exception
{
	password.sendKeys(pw);
	Thread.sleep(2000);
}



}
