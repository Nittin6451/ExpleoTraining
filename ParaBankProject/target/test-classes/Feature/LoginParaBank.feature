Feature: 
  Registering and Logining in the ParaBank Webpage

  Background: 
    Given User is the on the Login Page "https://parabank.parasoft.com/parabank/index.htm?ConnType=JDBC"

  @ValidCredentials
  Scenario Outline: User Logining with VaildCredentials in ParaBank Website
    When User enters the Parausername "<username>"
    When User enters the Parapassowrd "<password>"
    Then User clciks the Login
    Then User gets the Confiramtion Message

    Examples: 
      | username | password  |
      | Akashi   | Nittin123 |
      | Nittin   | Nittin123 |

  @InvalidCredentilas
  Scenario Outline: User Logining with InvaildCredentials in ParaBank Website
    When User enters the invalidusername "<invalidusername>"
    When user enters the invalidpassword "<invalidpassword>"
    Then User clciks the Loginbutton
    Then User gets the Error Message

    Examples: 
      | invalidusername | invalidpassword |
      | Akash           | Nittin123       |
      | Akashi          | Nittin12        |
