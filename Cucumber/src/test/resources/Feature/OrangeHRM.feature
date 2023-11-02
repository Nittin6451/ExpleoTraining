Feature: Login to HRM Application

  Scenario: Login with Vaild credentials
    Given User is on HRMLogin page 
    When User enters username , password and clicks login
    Then User should be able to Login Successfully and Home page opens