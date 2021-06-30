Feature: Practice form

  @regression
  Scenario: Fill Practice Form
    Given A Student want to register in a website
    When The student fills all the fields
    Then The student should see all the information in a new window
