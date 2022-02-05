#Author: ravi.bhadauria@healthasyst.com
Feature: Validate Payment Collection


Scenario Outline: Validate Accepts Payment
Given User want to navigate url
And User login with <username> and <password>
When User click on Payment tab
And User click on <fName> , <lName> and <dob>
And User click on Next button
And Validate Review Payment
And User click on Edit Button
And User Clear the Amount
And User enter the 10 dollar amount
And User click on Confirm Button
And User click on Pay by Card button
And User click on Payment Pop up Confirmation

And User click on New Card Tab
When User enter the card number, expiration and cvv
And Click on make a payment
Then Validate Payment message 
Examples:
| username                     | password|fName|lName |dob       |
|nikilam@healthasyst.com|Rece@0000|Tina |Bodkin|03/06/1975|

#@REGRESSIONTESTING
Scenario Outline: Validate Accepts Payment
#Given User want to navigate url
#And User login with <username> and <password>
When User click on Payment tab
And User click on <fName> , <lName> and <dob>
And User click on Next button
And Validate Review Payment
And User click on Edit Button
And User Clear the Amount
And User enter the 10 dollar amount
And User click on Confirm Button
And User click on Pay by Card button
And User click on Payment Pop up Confirmation
And User click on New Card Tab
When User enter the card number, expiration and cvv
And Click on make a payment
Then Validate Payment message 
Examples:
| username                     | password|fName|lName |dob       |
|nikilam@healthasyst.com|Rece@0000|Tina |Bodkin|03/06/1975|
|nikilam@healthasyst.com|Rece@0000|Tina |Bodkin|03/06/1975|

@REGRESSIONTESTING
Scenario Outline: Validate Accepts Payment
#Given User want to navigate url
#And User login with <username> and <password>
When User click on Payment tab
And User click on <fName> , <lName> and <dob>
And User click on Next button
And Validate Review Payment
And User click on Edit Button
And User Clear the Amount
And User enter the amount
And User click on Confirm Button
And User click on Pay by Card button
And User click on Payment Pop up Confirmation
And User click on New Card Tab
When User enter the card number, expiration and cvv
And Click on make a payment
Then Validate Payment message
Examples: 
| name  | value | status  |
| name1 |     5 | success |
| name2 |     7 | Fail    |