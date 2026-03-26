package tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import steps.LoginSteps;

@RunWith(SerenityRunner.class)
public class LoginTest {

	@Steps
	LoginSteps loginSteps;

	@Test
	public void verifyLoginFlow() {
		loginSteps.login();
	}
}