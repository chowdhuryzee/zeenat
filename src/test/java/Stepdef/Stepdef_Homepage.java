package Stepdef;

import Pageaction.Homepageactoin;
import Util.testBase;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Stepdef_Homepage extends testBase {
	
	Homepageactoin homepageactoin =new Homepageactoin();
	@Given("^Open Application \"([^\"]*)\"$")
	public void open_Application(String URL) throws Throwable {
		launchhh(URL);   
	}

	@Then("^Click on Login button$")
	public void click_on_Login_button() throws Throwable {
		homepageactoin.clickonlogin();   
	}

	@Then("^Enter user name and password$")
	public void enter_user_name_and_password() throws Throwable {
	    
	}

	@Then("^Click on login button$")
	public void click_on_login_button() throws Throwable {
	    
	}

	@Then("^Verify User Can Login$")
	public void verify_User_Can_Login() throws Throwable {
	   
	}

}
