package uiSP;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPageSP {

    public static final Target USERNAME_INPUT =
        Target.the("username field")
              .located(By.id("Email"));

    public static final Target PASSWORD_INPUT =
        Target.the("password field")
              .located(By.id("Password"));

    public static final Target LOGIN_BUTTON =
        Target.the("login button")
              .located(By.xpath("//button[text()='Log in']"));
}