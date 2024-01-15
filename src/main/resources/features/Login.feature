Feature: User should be able to login to the system

  Background: User open the browser and navigates to the login page
    Given User opens the browser
    And User navigates to login page

  Scenario: User login with valid username and password
    When User enters username "tomsmith"
    And Enters password "SuperSecretPassword!"
    And Press login
    Then Success message appears
    And Press Logout

  Scenario: User login with invalid username and password
    When User enters username "incorrect username"
    And Enters password "Incorrect password"
    And Press login
    Then Failure message appears