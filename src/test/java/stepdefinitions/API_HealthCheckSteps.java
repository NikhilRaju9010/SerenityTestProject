package stepdefinitions;

import io.cucumber.java.en.*;
public class API_HealthCheckSteps {

    @When("user sends GET request to website")
    public void callWebsite() {
        api.HealthCheckClient.getWebsite();
    }

    @Then("response status should be {int}")
    public void validateStatus(int code) {
        api.HealthCheckAssertions.verifyStatusCode(code);
    }

    @Then("response should contain valid HTML content")
    public void validateContent() {
        api.HealthCheckAssertions.verifyPageContent();
    }
}