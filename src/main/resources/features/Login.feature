Feature: User should be able to login to the system

  Scenario: User login with valid username and password
    Given User opens the browser
    And User navigates to login page
    When User enters correct username
    And correct password
    Then Success message appears