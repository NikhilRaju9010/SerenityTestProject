package api;

import net.serenitybdd.rest.SerenityRest;
import static org.hamcrest.Matchers.*;

public class HealthCheckAssertions {

    public static void verifyStatusCode(int statusCode) {
        SerenityRest.then().statusCode(statusCode);
    }

    public static void verifyPageContent() {
        SerenityRest.then()
                .body(containsString("<html"))   // basic HTML check
                .body(containsString("Selenium")); // page keyword check
    }
}
