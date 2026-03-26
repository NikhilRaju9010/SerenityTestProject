package exampleTests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class FirstTestCase {

    @Managed
    WebDriver driver;

    @Test
    public void gotoSeleniumPage() {
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}