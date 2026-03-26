package stepdefinitions;

import javax.inject.Inject;

import constants.LoginData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class loginPageStep {
	@Inject
	LoginPage loginpage;
	
	@Given("user is on login page")
	public void user_is_on_login_page() {
		loginpage.goToPage(LoginData.BASE_URL);
	}

	@When("user enters valid credentials")
	public void user_enters_valid_credentials() throws Exception{
		loginpage.enterUsername(LoginData.VALID_USERNAME);
		Thread.sleep(2000);
    	loginpage.enterPassword(LoginData.VALID_PASSWORD);
    	Thread.sleep(3000);
    	loginpage.clickLogin();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
	    System.out.println("Login Successfully");
	}


}
