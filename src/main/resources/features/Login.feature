Feature: User should be able to login to the system

  Scenario: User login with valid username and password
    Given User opens the browser
    And User navigates to login page
    When User enters correct username
    And Correct password
    And Press login
    Then Success message appears
    And Press Logout