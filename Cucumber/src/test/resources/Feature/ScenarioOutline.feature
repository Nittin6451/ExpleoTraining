Feature: Logining into a Web Application

  @ValidCredentials
  Scenario Outline: Login Using VaildCredentials
    Given user is on the Web page "https://opensource-demo.orangehrmlive.com/"
    When User enters the Username as "<user>"
    And User enters the Password as "<pass>"
    And User Clicks the Login
    Then user is navigated to Homepage
    Then User should be able to Login Successfully

    Examples: 
      | user  | pass     |
      | Admin | admin123 |
      | admin | amid2    |
      |       |          |
