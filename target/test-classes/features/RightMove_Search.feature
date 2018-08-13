Feature: As a user of RightMove when I am on the website and I carryout a for sale search I want to be able to find different properties

  Scenario:
    Given I am am on RightMove website
    And I click on the search field
    And I enter the text "London"
    And I click on the For sale tab
    And I select the search radius
    And I select the price range
    And I select the number of bedrooms
    And I select the property type
    And I select added to site
    And I select Find properties
    Then matching my selections should be displayed


