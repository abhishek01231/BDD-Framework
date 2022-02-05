Feature: google search

  Scenario Outline: simple google search
    Given I have entered the google homepage
    When The search string <word> is entered in textbox
    And click the search button
    Then result for <word> is shown

    Examples: 
      | word        |
      | healthasyst |

  @test
  Scenario: Image search
    Given I am at the google page
    When click the image link on top
    Then result is shown

  Scenario: locating using map
    Given I am at the google page
    When click the MAP  link on top
    And click the direction
    And choose your location
    Then distance and map shold be available

  Scenario: Driving to the location by car
    Given I am at the map page and my location is entered1
    When click on drive by car option
    Then Map should display the route

  Scenario: Locating gas station  along the route
    Given I am at the map page and my location is entered
    When click on gas station option
    Then Map shold suggest the gas station
