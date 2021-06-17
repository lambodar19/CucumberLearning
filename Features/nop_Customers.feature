Feature: Customers
  Background: Login
    Given User launches the chrome browser
    When user opens the URL "https://admin-demo.nopcommerce.com/login"
    And User enters username as "admin@yourstore.com" and password "admin"
    And Click on Login

  Scenario: Add a new Customer
    Then User can view Dashboard
    When User clicks on Customer Menu
    And Clicks on Customer Menu Item
    And Clicks on Add New Button
    Then User can view Add Customer Page
    When User enters Customer Info
    And Clicks on Save Button
    Then User can view confirmation message "The new customer has been added successfully."
    And Close browser

    Scenario: Search a Customer
      Then User can view Dashboard
      When User clicks on Customer Menu
      And Clicks on Customer Menu Item
      And Enter Customer Email
      When Click on Search Button
      Then User should be found in the search table
      And Close browser