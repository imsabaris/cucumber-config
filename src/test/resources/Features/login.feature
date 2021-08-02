Feature: To validate the Login functionality in facebook

  Scenario Outline: To validate the invalid username and invalid password
    When user has to enter "<username>" and "<password>"
    And user has to click login button
    Then user will navigate to reenter login page

    Examples: 
      | username     | password |
      | selenium@123 | selenium |

  # | java@123     | java     |
  #| greens@123   | greens   |
  @smoke
  Scenario: To validate the login page without entering credentials
    When user clicks login button
    Then user will be in invalid credential page
