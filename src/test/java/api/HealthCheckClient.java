package api;

import net.serenitybdd.rest.SerenityRest;

public class HealthCheckClient {

    public static void getWebsite() {
        SerenityRest.given()
                .baseUri(BaseEndPoints.BASE_URL)
        .when()
                .get();
    }
}
