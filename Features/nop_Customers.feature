Feature: Customers
  Scenario: Add a new Customer
    Given User launches the chrome browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And User enters username as "admin@yourstore.com" and password "admin"
    And Click on Login
    Then User can view Dashboard
    When User clicks on Customer Menu
    And Clicks on Customer Menu Item
    And Clicks on Add New Button
    Then User can view Add Customer Page
    When User enters Customer Info
    And Clicks on Save Button
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser
