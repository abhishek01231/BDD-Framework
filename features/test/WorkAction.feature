Feature: Validate Work action

  Scenario Outline: Validate Work action
    Given User want to navigate to given Url
    And login by entering <username> and <password>
    And User click on login button
    And choose the team to enter
    When User click on Work action link
    And User enters the <fName> , <lName> and <dob>
    And User click on Next
    Then Validate Work action

    Examples: 
      | username                       | password  | fName | lName | dob        |
      | gokul.vignesha@fgghhj.com | Regguh | John  | Cena  | 01/01/1996 |

  Scenario: Validate Work action
    Given Work action page
    When User click on go to next
    And click on payment communication
    And click on Payment history
    Then Validate Payment history
