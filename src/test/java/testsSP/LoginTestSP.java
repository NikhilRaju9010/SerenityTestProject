package testsSP;

import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.annotations.Managed;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import tasksSP.LoginSP;
import constants.LoginData;

@RunWith(SerenityRunner.class)
public class LoginTestSP {
	
	@Managed
	WebDriver driver;

    Actor admin = Actor.named("Admin");
    
    @Before
    public void setUp() {
        admin.can(
        		BrowseTheWeb.with(driver)
        );
    }
    @Test
    public void verifyLoginFlow() {

        admin.attemptsTo(
            Open.url(LoginData.BASE_URL),
            LoginSP.withCredentials(
                LoginData.VALID_USERNAME,
                LoginData.VALID_PASSWORD
            )
        );
    }
}