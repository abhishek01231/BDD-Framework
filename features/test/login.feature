Feature: To do appointment

  @test
  Scenario Outline: Login to appointment page
    Given User wants to navigate appointment page
    And User login by <username> and <password>
    When User click on login
    And choose the team
    Then Appointment home page open

    Examples: 
      | username                       | password  |
      | gokul.vignesha@GMAIL.com | RFHGHJ |

  Scenario: validate transaction
    Given Appointment homepage
    When click the transaction link
    Then all transaction is available

  Scenario: View patient message
    Given Appointment homepage1
    When click view patient message link
    Then all patient message

  @test1
  Scenario Outline: Do payment
    Given Appointment page
    When click on payment link
    And User click  <fName> , <lName> and <dob>
    Then validate payment

    Examples: 
      | fName | lName | dob      |
      | gokul | Rece  | 01012021 |

  @test2
  Scenario: Validate logout
    Given Appointment page and menu is on topright
    When click logout button
    Then validate logout
    And Validate back button after logout
