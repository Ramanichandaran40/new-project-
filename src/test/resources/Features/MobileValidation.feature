#Author: your.email@your.domain.com
Feature: Title of your feature
  I want to use this template for my feature file

  Background: 
    And user login using valid credentials
@map
  Scenario: Mobile Check
    When user search mobile
    Then user select mobile
    And switch window

  Scenario: Data Table
    When user search mobile using one dimensional list
      | Samsung | Realme | Vivo |
    Then user select mobile
    And switch window

  Scenario: Data Table
    When user search mobile using one dimensional map
      | 1 | Realme      |
      | 2 | Sony Mobile |
      | 3 | IPhone      |
    Then user select mobile
    And switch window

  Scenario Outline: 
    When user search mobile "<phone>"
    Then user select mobile
    And switch window

    Examples: 
      | phone    |
      | OnePlus  |
      | Oppo     |
      | Micromax |
