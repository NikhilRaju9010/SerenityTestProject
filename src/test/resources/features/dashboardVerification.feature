Feature: Dashboard Verification functionality


   Scenario: Valid login
    Given user is on login page
    When user enters valid credentials
    Then user should be logged in successfully
    
 Scenario: Validate Dahboard
	Given User is on the admin dasboard
	When admin clikc on the dashboard
	Then dashboard should be visible
	
 Scenario: Validate catalog
 	Given User is on the admin dashboard
 	When admin click on the catalog
 	Then Catalog options should be visible