Feature: To validate amazon search functionality

  @regression
  Scenario: To validate the search box
    Given user has to be in search page
    When user has to give product name
    And user has to click search button
    Then user will be in the product page
    When user has to click the product
    Then user enters the add to cart page
