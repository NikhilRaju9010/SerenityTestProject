package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.core.pages.PageObject;

public class CucumberTestSteps extends PageObject{
	
	@Given("User go to the page one")
	public void user_go_to_the_page_one() {
		getDriver().get("https://serenity-bdd.github.io/");
	    
	}

	@When("User see the page one")
	public void user_see_the_page_one() {
	    System.out.println("User landed on the Page one");
	}

	@Then("user Unterstand the page one")
	public void user_unterstand_the_page_one() {
	    System.out.println("User wenth through the page one");
	}

	@Given("User go to the page two")
	public void user_go_to_the_page_two() {
		getDriver().get("https://serenity-bdd.github.io/docs/tutorials/first_test");
	}

	@When("User see the page two")
	public void user_see_the_page_two() {
		System.out.println("User landed on the Page two");
	}

	@Then("user Unterstand the page two")
	public void user_unterstand_the_page_two() {
		System.out.println("User wenth through the page two");
	}

	@Given("User go to the page three")
	public void user_go_to_the_page_three() {
		getDriver().get("https://serenity-bdd.github.io/docs/tutorials/screenplay");
	}

	@When("User see the page three")
	public void user_see_the_page_three() {
		System.out.println("User landed on the Page three");
	}

	@Then("user Unterstand the page three")
	public void user_unterstand_the_page_three() {
		System.out.println("User wenth through the page three");
	}

	@Given("User go to the page four")
	public void user_go_to_the_page_four() {
		getDriver().get("https://serenity-bdd.github.io/docs/tutorials/data-driven-testing");
	}

	@When("User see the page four")
	public void user_see_the_page_four() {
		System.out.println("User landed on the Page four");
	}

	@Then("user Unterstand the page four")
	public void user_unterstand_the_page_four() {
		System.out.println("User wenth through the page four");
	}

	@Given("User go to the page five")
	public void user_go_to_the_page_five() {
		getDriver().get("https://serenity-bdd.github.io/docs/tutorials/cicd-integration");
	}

	@When("User see the page five")
	public void user_see_the_page_five() {
		System.out.println("User landed on the Page five");
	}

	@Then("user Unterstand the page five")
	public void user_unterstand_the_page_five() {
		System.out.println("User wenth through the page five");
	}

}
