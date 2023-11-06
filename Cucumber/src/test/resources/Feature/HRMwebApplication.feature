Feature: Login to HRM WebApplication

  @validcredentials
  Scenario: Login with valid credentials
    Given User is on HRMLogin Webpage
    When User provides valid credentials
      | username | password  |
      | Admin    | admin@123 |
    Then User should be able to login successfully and see homepage

  @InvalidCredentials
  Scenario: Login with invalid credentials
    Given User is on HRMLogin Webpage
    When User provides invalid credentials
      | username | password |
      | Admin    | admin123 |
      | Admin    | admin234 |
    Then user should be able to see unsucessfull with new error message
