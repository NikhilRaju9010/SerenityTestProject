package tests;

import net.serenitybdd.annotations.Steps;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import steps.LoginSteps;

@ExtendWith(SerenityJUnit5Extension.class)
public class LoginTest {

    @Steps
    LoginSteps loginSteps;

    @Test
    void verifyLoginFlow() {
        loginSteps.login();
    }
}