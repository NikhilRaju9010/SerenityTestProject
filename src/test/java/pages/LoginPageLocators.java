package pages;

import org.openqa.selenium.By;

public class LoginPageLocators {

    public  static final By USERNAME_INPUT = By.xpath("//input[@id='Email']");
    public static final By PASSWORD_INPUT = By.xpath("//input[@id='Password']");
    public static final By LOGIN_BUTTON = By.xpath("//button[text()='Log in']");
    
    // Dynamic XPath
    public static By menuItem(String menuName) {
        return By.xpath("//ul[@class='menu']//li[text()='"+ menuName +"']");
    }
}