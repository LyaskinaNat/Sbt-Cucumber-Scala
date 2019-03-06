@feature3
Feature: Test feature 3

  Scenario: search google for Opencast Software
    Given that i am on the google home page
    When i enter 'Opencast Software' in search
    And i submit my search
    And i click on the first option listed
    Then i can validate that I am on the Opencast Software website