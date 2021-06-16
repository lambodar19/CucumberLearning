Feature: Login to NOP Commerce Portal
  Scenario: Successful login with valid credentials
    Given User launches the chrome browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And User enters username as "admin@yourstore.com" and password "admin"
    And Click on Login
    Then The Page Title should be "Dashboard / nopCommerce administration"
    When User clicks on the Logout Link
    Then The Page Title should be "Your store. Login"
    And Close browser