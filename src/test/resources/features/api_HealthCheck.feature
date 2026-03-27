Feature: Website Health Check

  Scenario: Verify website is up and running
    When user sends GET request to website
    Then response status should be 200
    And response should contain valid HTML content