package pages;

import net.serenitybdd.core.pages.PageObject;

public class LoginPage extends PageObject {
	
	public void goToPage(String URL) {
		 getDriver().get(URL);
	}

    public void enterUsername(String username) {
        $(LoginPageLocators.USERNAME_INPUT).type(username);
    }

    public void enterPassword(String password) {
        $(LoginPageLocators.PASSWORD_INPUT).type(password);
    }

    public void clickLogin() {
        $(LoginPageLocators.LOGIN_BUTTON).click();
    }
    
}