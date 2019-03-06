@feature2
Feature: Test feature 2

  Scenario: search google for udemy
    Given that i am on the google search
    When i enter 'Udemy' in search
    And i submit google search
    And i click on the first link listed
    Then i can validate that I am on the Udemy website