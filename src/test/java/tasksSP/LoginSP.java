package tasksSP;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Actor;
import static net.serenitybdd.screenplay.Tasks.instrumented;

import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import uiSP.LoginPageSP;

public class LoginSP implements Task {

    private String username;
    private String password;

    public  LoginSP(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public static  LoginSP withCredentials(String username, String password) {
        return instrumented(LoginSP.class, username, password);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
            Enter.theValue(username).into(LoginPageSP.USERNAME_INPUT),
            Enter.theValue(password).into(LoginPageSP.PASSWORD_INPUT),
            Click.on(LoginPageSP.LOGIN_BUTTON)
        );
    }
}