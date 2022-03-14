package gluecode;

import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pages.Homepage;
import pages.LoginPage;
import pages.LogoutPage;

public class Stepdef_login {
	public Sharedclass sh;
	public Stepdef_login(Sharedclass s)
	{
		sh=s;
	}

	@Given("open {string}")
	public void open(String string) throws Exception {
  	    WebDriverManager.chromedriver().setup();
  	    sh.driver=new ChromeDriver();
  	    sh.obj1=new Homepage(sh.driver);
  	    sh.obj2=new LoginPage(sh.driver);
  	  sh.obj3=new LogoutPage(sh.driver);
  	    
  	    
	}

	@Given("Launch site with {string}")
	public void launch_site_with(String url) {
		
		sh.driver.get(url);
	    
	}

	@When("login with {string} and {string}")
	public void login_with_and(String username, String password) throws Exception {
	   sh.obj1.FlipkartLogin(); 
	   sh.obj1.FillUsername(username);
	   sh.obj1.FillPassword(password);
	   sh.obj2.ClickloginButton();
		
	}	

}
