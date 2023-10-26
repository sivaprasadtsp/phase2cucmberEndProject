Feature: Phase End Project

  Background: 
    Given User open the chrome Browser and starhealth application

  Scenario: Starhealth HomePage test
    Then validate the star health home page title using a JUnit assertion
    Then clicks on the Buy Now button
    And User enters following details
      | FullName    | PhNo       | PIN   |
      | Siva Prasad | 8114489203 | 53564 |
    And Close the browser

  @simplilearn
  Scenario: Plan Page
    Then User click on the Plan for My Family page
    And Validate the user mobile number
    And User clicks on the Star Health logo
    And Close the browser