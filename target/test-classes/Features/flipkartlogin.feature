Feature: To validate Flipkart Login Functionality

  @smoke
  Scenario: To validate the invalid username and invalid password
    Given user has to be in the login page
    But User has to close the window
    When user has to give username and password
    And user has to click the login button
    Then user has to reenter to login page
