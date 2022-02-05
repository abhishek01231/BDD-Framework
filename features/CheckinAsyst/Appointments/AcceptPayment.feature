@REGRESSIONTESTING
Feature: Validate Accept Payment

@FUNCTIONALTESTING @REGRESSIONTESTING @ACCEPTPAYMENT
Scenario Outline: Accept Payment
Given User wants to navigate url
And User login with <username> and <password>
When User click on Accept Payment
Then Validate Accept Payment page
Examples:
| username | password |
|nikilam@GMAIL.com|AFAGG|
