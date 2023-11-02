Feature: Logining into a Web Application

Background:
	Given user is on the Login page "https://opensource-demo.orangehrmlive.com/"

@ValidCredentials

Scenario Outline: Login Using VaildCredentials 


When User enters the username as "<username>"
And User enters the password as "<password>"
And User Clicks the Login button
Then user is navigated to homepage
Then User should be able to login successfully

Examples:
	| username | password |
	| Admin    | admin123 |

@InvaildCredentials @InvalidUsernameAndPassword

Scenario: Login Using InVaildCredentials 


When User enters the invaildusername as "<username>"
And User enters the invaildpassword as "<password>"
And User Clicks the Login button
Then user is navigated to homepage
Then Login will be unsuccessfull

Examples:
| username | password |
| admin    | amid2    |

@InvalidCredentials @BlankCredentials

Scenario: Login Using InVaildBlankCredentials 


When User enters the Blankusername as "<username>"
And User enters the Blankpassword as "<password>"
And User Clicks the Login button
Then user is navigated to homepage
Then user gets a error message 


Examples:
	| username | password |
	|          |          |



