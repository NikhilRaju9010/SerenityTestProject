package pages;

import org.openqa.selenium.By;

public class DashboardPageLocators {
	
	public static final By DASHBOARD_BUTTON = By.xpath("//p[text()=' Dashboard']");
	public static final By DASHBOARD_TITLE = By.xpath("//h1[contains(text(),'Dashboard')]");
	public  static final By CATALOG_BUTTON = By.xpath("(//p[contains(text(),'Catalog')])[1]");
	public static final By PRODUCT_BUTTON = By.xpath("//p[text()=' Products']");
	
}
