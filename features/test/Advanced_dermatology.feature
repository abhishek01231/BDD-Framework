Feature: Appointment booking

  Background: Appointment home page
    Given User is valid and has appointment link
    When user enters the url
    Then Validate appointment home page appears

  Scenario: InOffice Appointment
    Given User is at Appointment page
    When User click on appointment type
    And Choose new or existing patient
    And User has to choose insurance
    And click on by location to book appointment
    And User selects loction and region from dropdown
    And user clicks on show schedule
    Then validate the appointment booking

  Scenario: verify select insurance
    Given User is at Appointment page
    When User click on appointment type
    And Choose new or existing patient
    And User has to choose insurance
    And Select insurance type
    And click on by location to book appointment
    And User selects loction and region from dropdown
    And user clicks on show schedule
    Then validate the appointment booking

  Scenario: verify appointment booking for existing patient
    Given User is at Appointment page
    When User click on appointment type
    And Choose new or existing patient
    And User has to choose insurance
    And Select insurance type
    And click on by location to book appointment
    And User selects loction and region from dropdown
    And user clicks on show schedule
    Then validate the appointment booking
    
      Scenario: verify appointment type Telehealth
    Given User is at Appointment page
    When User click on appointment type telehealth
    And Choose new or existing patient
    And User has to choose insurance
    And Select insurance type
    And click on by location to book appointment
    And User selects loction and region from dropdown
    And user clicks on show schedule
    Then validate the appointment booking
