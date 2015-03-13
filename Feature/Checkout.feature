Feature: To Test Checkout Functionality with Logged user and with anonomys user

  Background: 
    Given User is on Home Page

  Scenario: To Checkout with valid credentials
    When User Navigate to LogIn Page
    And User enters UserName and Password
    And User Select Product
    And User Press Add To Cart
    And User Press Go to Chekout
    Then User See  Checkout Cart
    Then User Will Close The driver

  Scenario: To Checkout with anonomys User
    When User Select Product
    And User Press Add To Cart
    And User Press Go to Chekout
    Then User See  Checkout Cart
    Then User Will Close The driver

    Scenario: To Check That Checkout button is already exist
    When User Navigate to LogIn Page
    And User enters UserName and Password
    And User Select Product
    And User Press Add To Cart
    And User Press Go to Chekout