package stepdefinitions;

import javax.inject.Inject;

import constants.LoginData;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DashboardPage;
import pages.LoginPage;

public class DashboardVerificationStep {
	
	
	@Inject
	DashboardPage dashbaordPage;
	LoginPage loginPage;
	
	@Given("User is on the admin dasboard")
	public void user_is_on_the_admin_dasboard() throws Exception {
		loginPage.goToPage(LoginData.BASE_URL);
		Thread.sleep(2000);
		loginPage.enterUsername(LoginData.VALID_USERNAME);
		Thread.sleep(3000);
		loginPage.enterPassword(LoginData.VALID_PASSWORD);
		Thread.sleep(1000);
		loginPage.clickLogin();
	    System.out.println("User is on admin dashboard");
	}

	@When("admin clikc on the dashboard")
	public void admin_clikc_on_the_dashboard() {
	    dashbaordPage.clickDahboardBtn();
	}

	@Then("dashboard should be visible")
	public void dashboard_should_be_visible() {
	   dashbaordPage.VerifyDashboard();
	}

	@Given("User is on the admin dashboard")
	public void user_is_on_the_admin_dashboard() throws Exception {
		loginPage.goToPage(LoginData.BASE_URL);
		Thread.sleep(2000);
		loginPage.enterUsername(LoginData.VALID_USERNAME);
		Thread.sleep(1000);
		loginPage.enterPassword(LoginData.VALID_PASSWORD);
		Thread.sleep(3000);
		loginPage.clickLogin();
	    System.out.println("User is on admin dashboard");
	}

	@When("admin click on the catalog")
	public void admin_click_on_the_catalog() {
	    dashbaordPage.clickCatalogBtn();
	}

	@Then("Catalog options should be visible")
	public void catalog_options_should_be_visible() {
	    dashbaordPage.verifyCatalog();
	}

}
