package gluecode;

import io.cucumber.java.en.Then;


public class Stepdef_logout {
	public Sharedclass sh;
	public Stepdef_logout(Sharedclass s)
	{
		sh=s;
	}
	
	@Then("do logout")
	public void do_logout() throws Exception {
		
	  	sh.obj3.clickmyaccount();  
	  	sh.obj3.clicklogout();
		}

}
