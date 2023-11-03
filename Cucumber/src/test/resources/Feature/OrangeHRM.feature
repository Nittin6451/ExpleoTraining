Feature: loging into hrm application

  Scenario: loging using valid creds
    Given user on homepage
    When user enter id
    And enters pass
    And click login
    Then navigates to homepage
