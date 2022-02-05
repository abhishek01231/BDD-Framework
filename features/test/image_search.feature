
  Scenario: simple google  image search
    Given the user opened web browser
    And user navigate to "https://google.co.in"
    When user enters the  string "healthasyst" is entered in textbox
    Then links related "healthasyst" is shown
    When the user clicks on "Images"link at the top
    Then Image result related to "healthasyst" is shown

    
    @google @keka
  Scenario: simple google search
    Given I have entered the google homepage
    When The search string "smartphone" is entered in textbox
    And click the search button
    Then result for "smartphone" is shown
    And The following related result are displayed
      | related              |
      | smartphone wikipedia |
      | latest smartphone    |

  Scenario Outline: simple google search
    Given I have entered the google homepage
    When The search string <any string> is entered in textbox
    And click the search button
    Then result for <any string> is shown
    And The following <related> result are displayed

    Examples:
      | any string | related       |
      | samsung    | samsung india |
      | redmi      | redmi india   |
    