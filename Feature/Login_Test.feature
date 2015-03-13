Feature: Login Action

  Scenario: Successful Login with Valid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password
    Then Welcome Message displayed at the header
    Then User Will Close The driver

  Scenario: Login with InValid Credentials
    Given User is on Home Page
    When User Navigate to LogIn Page
    And User enters UserName and Password With Wrong Credentials
    Then Error return to the user with invalid Login credentials
    Then User Will Close The driver
