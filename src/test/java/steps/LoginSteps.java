package steps;

import javax.inject.Inject;

import constants.LoginData;
import net.serenitybdd.annotations.Step;



import pages.LoginPage;

public class LoginSteps{

	@Inject
	LoginPage loginpage;
    

    @Step("Admin Login Process")
    public void login() {
    	loginpage.goToPage(LoginData.BASE_URL);
    	loginpage.enterUsername(LoginData.VALID_USERNAME);
    	loginpage.enterPassword(LoginData.VALID_PASSWORD);
    	loginpage.clickLogin();
    }


}