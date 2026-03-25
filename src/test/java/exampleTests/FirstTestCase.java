package exampleTests;

import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit5.SerenityJUnit5Extension;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

@ExtendWith(SerenityJUnit5Extension.class)
public class FirstTestCase {

    @Managed
    WebDriver driver;

    @Test
    public void gotoSeleniumPage() {
        driver.get("https://admin-demo.nopcommerce.com/login");
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
    }
}