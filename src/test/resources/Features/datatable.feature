Feature: To validate the Facebook login functionality

  Background: 
    Given user is in login page
    And user change to English language

  @sanity @smoke
  Scenario: To validate login using invalid 1D map credentials
    When user enter username and password
      | username   | password |
      | Greens@123 | greens   |
      | java@123   | java     |
    And user click the login button
    Then user is in reenter login page

  @smoke @sanity
  Scenario: To validate without passing credentials
    When user clicks login without data
    Then user reenter to login page
