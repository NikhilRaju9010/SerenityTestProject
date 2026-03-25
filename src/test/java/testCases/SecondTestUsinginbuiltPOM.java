package testCases;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

@ExtendWith(SerenityJUnit5Extension.class)
public class SecondTestUsinginbuiltPOM extends PageObject{
	
	@Managed
	WebDriver driver;
	
	@Test
	public void gotoQAselenium() {
		driver.get("https://selenium.ccbp.tech/");
		$(By.xpath("(//button[text()='Know More'])[1]")).click();
		driver.get("https://selenium.ccbp.tech/");
		WebElementFacade aboutMe =  $(By.xpath("//button[contains(text(),'About Me')]"));
		boolean status = aboutMe.isVisible();
		if(status) {
			System.out.println("About Me section is present");
			aboutMe.click();
		}
		else {
			System.out.println("About Me section is not present");
		}
		
	}

}
//To Run the test from maven build- clean verify -Dtest=SecondTestUsinginbuiltPOM
