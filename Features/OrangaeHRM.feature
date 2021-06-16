Feature: Orange HRM Login
  Scenario: Logo Presence on Orange HRM home page
    Given I launch chrome browser
    When I open Orange HRM home page
    Then Verify that the the logo is present on the page
    And Close the browser
