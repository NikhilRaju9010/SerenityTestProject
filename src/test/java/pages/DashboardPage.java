package pages;

import net.serenitybdd.core.pages.PageObject;

public class DashboardPage extends PageObject{

	public void clickDahboardBtn() {
		$(DashboardPageLocators.DASHBOARD_BUTTON).click();
	}
	
	public void VerifyDashboard() {
		boolean status = $(DashboardPageLocators.DASHBOARD_TITLE).isVisible();
		if(status) {
			System.out.println("Admin can visit the Dasbhoard");
		}
		//$(DashboardPageLocators.DASHBOARD_TITLE).shouldBeVisible();
	}
	
	public void clickCatalogBtn() {
		$(DashboardPageLocators.CATALOG_BUTTON).click();
	}
	
	public void verifyCatalog() {
		$(DashboardPageLocators.PRODUCT_BUTTON).shouldBeVisible();
	}
}
